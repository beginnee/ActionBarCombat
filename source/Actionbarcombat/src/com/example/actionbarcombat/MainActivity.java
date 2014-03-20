package com.example.actionbarcombat;


import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {
	ActionBar ab;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ab = getSupportActionBar();
        ab.setTitle("Current Activity");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}
	public void onPrevious(MenuItem i)
	{
		startActivity(new Intent(this,PrevActivity.class));
		this.finish();
	}
	public void onNext(MenuItem i)
	{
		startActivity(new Intent(this,NextActivity.class));
		this.finish();
	}
	public void onHome(MenuItem i)
	{
		startActivity(new Intent(this,ContentsActivity.class));
		this.finish();
	}
	public void onExit(MenuItem i)
	{
		this.finish();
	}
}
