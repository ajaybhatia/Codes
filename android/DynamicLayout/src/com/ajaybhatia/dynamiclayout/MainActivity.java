package com.ajaybhatia.dynamiclayout;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ScrollView scrollView = new ScrollView(this);
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		scrollView.addView(layout);
		
		TextView textView = new TextView(this);
		textView.setText("Dynamic Layouts");
		textView.setId(1000);
		layout.addView(textView);
		
		EditText editText = new EditText(this);
		editText.setText("Write something here");
		editText.setId(2000);
		layout.addView(editText);
		
		Button button = new Button(this);
		button.setText("Button");
		button.setId(3000);
		button.setOnClickListener(this);
		layout.addView(button);
		
		CheckBox[] checkBoxs = new CheckBox[10];
		
		for (int i = 0; i < 10; i++) {
			checkBoxs[i] = new CheckBox(this);
			checkBoxs[i].setId(4000 + (i + 1));
			checkBoxs[i].setText("CheckBox " + (i + 1));
			map.put(4000 + (i + 1), "CheckBox " + (i + 1));
			checkBoxs[i].setOnClickListener(this);
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

	@Override
	public void onClick(View v) {
		if (v.getId() == 3000)
			Toast.makeText(this, "You clicked a BUTTON", Toast.LENGTH_SHORT).show();
				
		if (v.getId() > 4000 && v.getId() <= 4010) {
			Toast.makeText(this, "You clicked " + map.get(v.getId()), Toast.LENGTH_SHORT).show();
		}
	}

}
