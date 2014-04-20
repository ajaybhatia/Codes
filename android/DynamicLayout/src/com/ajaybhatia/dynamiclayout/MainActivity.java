package com.ajaybhatia.dynamiclayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ScrollView scrollView = new ScrollView(this);
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		scrollView.addView(layout);
		
		TextView textView = new TextView(this);
		textView.setText("Dynamic Layouts");
		layout.addView(textView);
		
		EditText editText = new EditText(this);
		editText.setText("Write something here");
		layout.addView(editText);
		
		Button button = new Button(this);
		button.setText("Button");
		layout.addView(button);
		
		CheckBox[] checkBoxs = new CheckBox[10];
		
		for (int i = 0; i < 10; i++) {
			checkBoxs[i] = new CheckBox(this);
			checkBoxs[i].setText("CheckBox " + (i + 1));
			layout.addView(checkBoxs[i]);
		}
		
		setContentView(scrollView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
