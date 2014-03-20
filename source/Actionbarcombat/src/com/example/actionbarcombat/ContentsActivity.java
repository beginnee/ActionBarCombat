package com.example.actionbarcombat;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ContentsActivity extends ActionBarActivity {

	ActionBar ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contents);
		ab = getSupportActionBar();
        ab.setTitle("Contents");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.contents, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	public void onExit(MenuItem i)
	{
		this.finish();
	}
}
