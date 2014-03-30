package com.ajaybhatia.simplecalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button addButton = (Button) findViewById(R.id.button1);
		Button subButton = (Button) findViewById(R.id.button2);
		
		addButton.setOnClickListener(this);
		subButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		EditText et1 = (EditText) findViewById(R.id.editText1);
		EditText et2 = (EditText) findViewById(R.id.editText2);
		TextView tv = (TextView) findViewById(R.id.textView1);
		
		int num1 = Integer.parseInt(et1.getText().toString());
		int num2 = Integer.parseInt(et2.getText().toString());
		
		switch(v.getId()) {
			case R.id.button1:
				tv.setText(String.valueOf(num1 + num2));
				break;
				
			case R.id.button2:
				tv.setText(String.valueOf(num1 - num2));
				break;
		}
	}

}
