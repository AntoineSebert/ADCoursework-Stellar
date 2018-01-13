package com.space.anthony.stellar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Anthony on 12/01/2018.
 */

public class Tools {
	private static final Tools ourInstance = new Tools();

	public static Tools getInstance() {
		return ourInstance;
	}

	private Tools() {}

	// SLEEP ///////////////////////////////////////////////////////////////////////////////////////
		public static void sleep(int time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	// NAVIGATE ////////////////////////////////////////////////////////////////////////////////////
		public static <Activity> void navigate(AppCompatActivity fromActivity, Class<Activity> toActivity) {
			Intent intent = new Intent(fromActivity, toActivity);
			fromActivity.finish();
			fromActivity.startActivity(intent);
		}
		public static <Activity> void navigate(AppCompatPreferenceActivity fromActivity, Class<Activity> toActivity) {
			Intent intent = new Intent(fromActivity, toActivity);
			fromActivity.finish();
			fromActivity.startActivity(intent);
		}
	// SHOWTOAST ///////////////////////////////////////////////////////////////////////////////////
	public static void showToast(final AppCompatActivity activity, final String text) {
		activity.runOnUiThread(new Runnable() {
			@Override
			public void run() { Toast.makeText(activity, text, Toast.LENGTH_SHORT).show(); }
		});
	}
	public static void showToast(final AppCompatPreferenceActivity activity, final String text) {
		activity.runOnUiThread(new Runnable() {
			@Override
			public void run() { Toast.makeText(activity, text, Toast.LENGTH_SHORT).show(); }
		});
	}
}
