package com.example.thirdapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity 
{
	String classes[]={"StartingPoint","TextPlay","Email","Click_2_Stick","Data","Graphics","Graphics_Surface","SoundSound","Tabs","Browser","Flipper","SharePrefs","InternalStorage","ExternalStorage","Accelerometer","SQL_Lite","pk"
			,"HttpClient","OpenGL","WeatherXmlParser"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	
		
		setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese=classes[position];
		try
		{
		Class a=Class.forName("com.example.thirdapp."+cheese);
		Intent b=new Intent(Menu.this,a);
		startActivity(b);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu)

	{
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater capactiveButtonMenu=getMenuInflater();
	    capactiveButtonMenu.inflate(R.menu.avant_grade_menu, menu);
	    return true;
	    
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		case R.id.credits:
			Intent about=new Intent("com.example.thirdapp.ABOUTUS");
			startActivity(about);
			break;
		case R.id.Preferences:
			Intent pre=new Intent("com.example.thirdapp.PREFER");
			startActivity(pre);
			break;
		case R.id.Exit:
			finish();
			break;
		}
		return false;
		
	}
	
  
}
