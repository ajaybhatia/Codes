package com.ajaybhatia.xtremecam;

import android.app.Service;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.util.Log;

public class XtremeCamService extends Service {

	private static final String TAG = "XtremeCamera";
	private SensorManager sensorManager;
	private Sensor acclerometerSensor;
	private Sensor proximitySensor;
	
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
	public void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "Service stopped. Unregistering accelerometer listener");
	}

}
