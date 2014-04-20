package com.ajaybhatia.dbconnect;

import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView listView;
	private SQLiteDatabase db;

	private static final int MENU_ADD = Menu.FIRST;
	private static final int MENU_QUIT = Menu.FIRST + 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		listView = new ListView(this);
		registerForContextMenu(listView);
		
		db = openOrCreateDatabase("db", MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS table_of_db(value REAL)");
		update_list();
		
		setContentView(listView);
	}

	private void update_list() {
		ArrayList<String> results = new ArrayList<String>();
		db.execSQL("INSERT into table_of_db VALUES(20)");
		Cursor cursor = db.rawQuery("SELECT value FROM table_of_db ORDER BY value", null);
		
		while (cursor.moveToNext())
			results.add(String.valueOf(cursor.getColumnIndex("value")));
		
		cursor.close();
		
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, results));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
