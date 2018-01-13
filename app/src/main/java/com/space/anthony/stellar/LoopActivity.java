package com.space.anthony.stellar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoopActivity extends AppCompatActivity {

	FirebaseDatabase database;
	DatabaseReference myRef;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loop);
		/*
		database = FirebaseDatabase.getInstance();
		myRef = database.getReference("message");

		myRef.addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot dataSnapshot) {
				String value = dataSnapshot.getValue(String.class);
			}

			@Override
			public void onCancelled(DatabaseError error) {
				Log.w("DATABASE", "Failed to read value.", error.toException());
			}
		});
		*/

		mainLoop();
	}

	private void mainLoop() {

		//Toast.makeText(LoopActivity.this, "mainloop", Toast.LENGTH_SHORT).show();
	}

	private void navigationMenu() {
		// return to main
		Tools.navigate(LoopActivity.this, MainMenuActivity.class);
		// par parameters
		/*
		Intent intent = new Intent(LoopActivity.this, ParametersActivity.class);
		startActivity(intent);
		*/
	}
}
