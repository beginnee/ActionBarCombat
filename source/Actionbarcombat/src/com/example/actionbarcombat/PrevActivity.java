package com.example.actionbarcombat;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class PrevActivity extends ActionBarActivity {
	ActionBar ab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prev);
		ab = getSupportActionBar();
        ab.setTitle("Previous Activity");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.prev, menu);
		return super.onCreateOptionsMenu(menu);
	}
	public void onNext(MenuItem i)
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
