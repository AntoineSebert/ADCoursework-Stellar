package com.space.anthony.stellar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			public void run() {
				Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
				finish();
				startActivity(intent);
				Tools.navigate(WelcomeActivity.this, LoginActivity.class);
			}
		}, 3000);
	}
}