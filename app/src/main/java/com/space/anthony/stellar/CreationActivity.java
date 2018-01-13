package com.space.anthony.stellar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreationActivity extends AppCompatActivity {

	FirebaseDatabase database;
	DatabaseReference myRef;
	Game game;
	StellarSystem system;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_creation);

		createSystem();
		uploadSystem();

		Tools.sleep(3000);
		Tools.navigate(CreationActivity.this, LoopActivity.class);
	}

	private void createSystem() {
		game = new Game();
		system = new StellarSystem();
		system.setName("Céléno");
		Tools.showToast(this, system.getDesignation());
	}

	private void uploadSystem() {
		database = FirebaseDatabase.getInstance();
		myRef = database.getReference("users");
		myRef.setValue(system);
	}
}
