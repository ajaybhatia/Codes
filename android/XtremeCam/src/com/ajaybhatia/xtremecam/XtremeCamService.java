package com.ajaybhatia.xtremecam;

import java.util.List;

import android.app.KeyguardManager;
import android.app.Service;
import android.app.KeyguardManager.KeyguardLock;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.MediaStore;
import android.util.Log;

public class XtremeCamService extends Service {

	private static final String TAG = "XtremeCamera";
	
	private SensorManager sensorManager;
	private Sensor acclerometerSensor;
	private Sensor proximitySensor;
	
	private boolean accelerometerPresent;
	private boolean proximityPresent;
	private boolean isInPocket = false;
	private boolean wasUp = true;
	private boolean wasDown = false;
	private boolean useProximity;
	private boolean useGyroscope;
	
	private int threshold;
	private int countUp;
	private int countDown;
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.i(TAG, "Service started.");
		return START_STICKY;
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		//SharedPreferences settings = getSharedPreferences("app_pref", 0);
		useGyroscope = false; //settings.getBoolean("useGyroscope", false);
		useProximity = true;//settings.getBoolean("useProximity", true);
		threshold = 7;//settings.getInt("threshold", 0);
		
		sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
		List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
		if (sensorList.size() > 0) {
			Log.i(TAG, "Accelerometer sensor detected");
			accelerometerPresent = true;
			acclerometerSensor = sensorList.get(0);
		} else {
			Log.e(TAG, "No accelerometer sensor detected. Stopping service");
			accelerometerPresent = false;
			stopSelf();
		}
		
		sensorList = null;
		sensorList = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
		if (sensorList.size() > 0) {
			Log.i(TAG, "Proximity sensor detected");
			proximityPresent = true;
			proximitySensor = sensorList.get(0);
		} else {
			Log.w(TAG, "No proximity sensor detected");
			proximityPresent = false;
		} 
		
		if (accelerometerPresent) {
			Log.i(TAG, "Registering accelerometer sensor and listener");
			sensorManager.registerListener(AccelerometerEventListener, acclerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
		}
		
		if (useProximity && proximityPresent) {
			Log.i(TAG, "Registering proximity sensor and listener");
			sensorManager.registerListener(ProximityEventListener, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);
		}
		
		PowerManager powerManager = (PowerManager)getSystemService(Context.POWER_SERVICE);
		WakeLock wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "XtremeCamServiceWakelock");
		wakeLock.acquire();
		Log.i(TAG, "Acquired Partial wakelock for background service");
		
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "Service stopped. Unregistering accelerometer listener");
		sensorManager.unregisterListener(AccelerometerEventListener);
		if (useProximity == true && proximityPresent == true) {
			Log.i(TAG, "Unregistering proximity listener");
			sensorManager.unregisterListener(ProximityEventListener);
		}
	}

	public void launchCamera() {
		Log.i(TAG, "Validating requirements for camera launch");
		
		if (isInPocket == false) {
			Log.i(TAG, "Phone not in pocket");
			if (countUp == 2 && countDown == 2) {
				Log.i(TAG, "Gesture requirements met (double twist)");
				
				Log.i(TAG, "Checking for screen on");
				PowerManager powerManager = (PowerManager)getSystemService(Context.POWER_SERVICE);
				boolean isScreenOn = powerManager.isScreenOn();
				
				if (isScreenOn == false) {
					turnOnScreen(this);
				}
				
				Log.i(TAG, "Requirements met");
				
				try {
					Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
					intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					boolean isCameraAlreadyRunning = isCameraRunning();
					if (intent != null && isCameraAlreadyRunning == false) {
						Log.i(TAG, "Starting Camera");
						startActivity(intent);
					}
				} catch (ActivityNotFoundException e) {}
				
				resetState();
			} else {
				Log.w(TAG, "Missing requirements for running camera (1)");
			}
		} else {
			Log.w(TAG, "Missing requirements for running camera (2)");
		}
	}
	
	public void turnOnScreen(Context context) {
		Log.i(TAG, "Acquiring wakelock to turn on the screen");
		PowerManager powerManager = (PowerManager)getSystemService(Context.POWER_SERVICE);
		WakeLock wakeLock = powerManager.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK 
								| PowerManager.FULL_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP, "XtremeCamWakeLock");
		wakeLock.acquire(5000);
		
		Log.i(TAG, "Disabling keygaurd");
		KeyguardManager keyguardManager = (KeyguardManager)getSystemService(Context.KEYGUARD_SERVICE);
		KeyguardLock keyguardLock = keyguardManager.newKeyguardLock(KEYGUARD_SERVICE);
		keyguardLock.disableKeyguard();
	}
	
	public boolean isCameraRunning() {
		Log.i(TAG, "Verifying if camera app is already running or not");
		Camera camera = null;
		try {
			camera = Camera.open();
		} catch(RuntimeException e) {
			Log.i(TAG, "Camera is already running");
			return true;
		} finally {
			if (camera != null )
				camera.release();
				Log.i(TAG, "Releasing camera");
		}
		
		Log.i(TAG, "Camera not running");
		return false;
	}
	
	public void resetState() {
		Log.i(TAG, "Resetting state since gesture requirements were met");
		countUp = countDown = 0;
		wasUp = true;
		wasDown = false;
	}
	
	SensorEventListener AccelerometerEventListener = new SensorEventListener() {
		
		@Override
		public void onSensorChanged(SensorEvent arg0) {
			Log.i(TAG, "Acceleration detected, computing values");
			float constant = 0.8f;
			float x = arg0.values[0];
			float linearX, gravity = 0;
			
			gravity = constant * gravity + (1 - constant) * arg0.values[0];
			linearX = x - gravity;
			
			Log.i(TAG, "Acceleration: " + x);
			Log.i(TAG, "Gravity: " + gravity);
			Log.i(TAG, "Linear Acceleration: " + linearX);
			
			if (linearX > threshold) {
				if (wasUp == false && wasDown == true) {
					Log.i(TAG, "Turn Up");
					countUp = countUp + 1;
					wasUp = true;
					wasDown = false;
				}
			} else if (linearX > -threshold) {
				if (wasDown == false && wasUp == true) {
					Log.i(TAG, "Turn Down");
					countDown = countDown + 1;
					wasUp = false;
					wasDown = true;
				} 
			}
			
			launchCamera();
	}
		
		
		@Override
		public void onAccuracyChanged(Sensor arg0, int arg1) {}
	};
	
	SensorEventListener ProximityEventListener = new SensorEventListener() {
		
		@Override
		public void onSensorChanged(SensorEvent arg0) {
			float distance = arg0.values[0];
			
			if (distance == arg0.sensor.getMaximumRange()) {
				Log.i(TAG, "Phone is outside the pocket");
				isInPocket = false;
			} else {
				Log.i(TAG, "Phone is in the pocket");
				isInPocket = true;
			}
		}
		
		@Override
		public void onAccuracyChanged(Sensor arg0, int arg1) {}
	};
}
