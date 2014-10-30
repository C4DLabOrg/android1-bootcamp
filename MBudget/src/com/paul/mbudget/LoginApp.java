package com.paul.mbudget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class LoginApp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_app);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_app, menu);
		return true;
	}

	public void show_signup(View view) {
		// take the user to the signup screen
		Intent view_signup = new Intent("com.paul.mbudget.Signup");
		startActivity(view_signup);
	}

}
