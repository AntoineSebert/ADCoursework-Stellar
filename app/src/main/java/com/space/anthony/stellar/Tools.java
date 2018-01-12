package com.space.anthony.stellar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Anthony on 12/01/2018.
 */

public class Tools {
	private static final Tools ourInstance = new Tools();

	public static Tools getInstance() {
		return ourInstance;
	}

	private Tools() {
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static <Activity> void navigate(AppCompatActivity fromActivity, Class<Activity> toActivity) {
		Intent intent = new Intent(fromActivity, toActivity);
		fromActivity.finish();
		fromActivity.startActivity(intent);
	}
}
