package com.space.anthony.stellar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainMenuActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();

		// RESUME //////////////////////////////////////////////////////////////////////////////////
		myRef.addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot dataSnapshot) {
				String value = dataSnapshot.getValue(String.class);
				if (value != null) {
					ToggleButton resumeButton = findViewById(R.id.resume_button);
					resumeButton.setEnabled(true);
				}
			}
			@Override
			public void onCancelled(DatabaseError error) {
				Log.w("DATABASE", "Failed to read value.", error.toException());
			}
		});

		// NEW GAME ////////////////////////////////////////////////////////////////////////////////
		Button newGameButton = findViewById(R.id.new_game_button);
		newGameButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FirebaseDatabase.getInstance().getReference().addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot dataSnapshot) {
						String value = dataSnapshot.getValue(String.class);
						if (value != null) {
							finish();
							Intent intent = new Intent(MainMenuActivity.this, MainMenuActivity.class);
							startActivity(intent);
						}
						else {

						}
					}
					@Override
					public void onCancelled(DatabaseError error) {
						Log.w("DATABASE", "Failed to read value.", error.toException());
					}
				});
			}
		});

		// PARAMETERS //////////////////////////////////////////////////////////////////////////////
		Button parametersButton = findViewById(R.id.parameters_button);
		parametersButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
				Intent intent = new Intent(MainMenuActivity.this, ParametersActivity.class);
				startActivity(intent);
			}
		});

		// QUIT ////////////////////////////////////////////////////////////////////////////////////
		Button quitButton = findViewById(R.id.quit_button);
		quitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
				System.exit(0);
			}
		});
	}
}
