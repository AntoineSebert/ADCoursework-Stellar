package com.space.anthony.stellar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.io.Serializable;

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
	// SHOW_TOAST //////////////////////////////////////////////////////////////////////////////////
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
	// INTEGER_TO_ROMAN_NUMERAL ////////////////////////////////////////////////////////////////////
		public static String integerToRomanNumeral(int input) {
			if (input < 1 || input > 3999)
				return "Invalid Roman Number Value";
			String s = "";
			while (input >= 1000) {
				s += "M";
				input -= 1000;
			}
			while (input >= 900) {
				s += "CM";
				input -= 900;
			}
			while (input >= 500) {
				s += "D";
				input -= 500;
			}
			while (input >= 400) {
				s += "CD";
				input -= 400;
			}
			while (input >= 100) {
				s += "C";
				input -= 100;
			}
			while (input >= 90) {
				s += "XC";
				input -= 90;
			}
			while (input >= 50) {
				s += "L";
				input -= 50;
			}
			while (input >= 40) {
				s += "XL";
				input -= 40;
			}
			while (input >= 10) {
				s += "X";
				input -= 10;
			}
			while (input >= 9) {
				s += "IX";
				input -= 9;
			}
			while (input >= 5) {
				s += "V";
				input -= 5;
			}
			while (input >= 4) {
				s += "IV";
				input -= 4;
			}
			while (input >= 1) {
				s += "I";
				input -= 1;
			}
			return s;
		}
}
