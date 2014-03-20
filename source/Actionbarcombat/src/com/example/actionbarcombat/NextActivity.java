package com.example.actionbarcombat;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class NextActivity extends ActionBarActivity {
ActionBar ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next);
		ab = getSupportActionBar();
        ab.setTitle("Next Activity");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.next, menu);
		return super.onCreateOptionsMenu(menu);
	}
	public void onPrevious(MenuItem i)
	{
		startActivity(new Intent(this,MainActivity.class));
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
