package com.ajaybhatia.xtremecam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final String TAG = "XtremeCamera";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.main);
		startService(new Intent(this, XtremeCamService.class));
		Log.i(TAG, "Service started");
		Toast.makeText(this, "XtremeCam service started. Now Twist phone for opening Camera app", Toast.LENGTH_SHORT).show();
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
