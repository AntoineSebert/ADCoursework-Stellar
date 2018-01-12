package com.space.anthony.stellar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreationActivity extends AppCompatActivity {

	FirebaseDatabase database;
	DatabaseReference myRef;
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
		Toast.makeText(CreationActivity.this, "createSystem", Toast.LENGTH_SHORT).show();
		system = new StellarSystem();
		system.setName("Céléno");

	}

	private void uploadSystem() {
		database = FirebaseDatabase.getInstance();
		myRef = database.getReference("users");
		myRef.setValue(system);
	}
}
