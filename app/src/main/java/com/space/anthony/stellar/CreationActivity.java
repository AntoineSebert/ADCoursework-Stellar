package com.space.anthony.stellar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreationActivity extends AppCompatActivity {
	private FirebaseDatabase database;
	private DatabaseReference myRef;
	private Game game;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_creation);
	}

	@Override
	protected void onStart() {
		super.onStart();
		createGame();
		uploadGame();

		Tools.sleep(3000);
		Tools.navigate(CreationActivity.this, LoopActivity.class);
	}

	private void createGame() {
		game = new Game();
		List<StellarSystem> systems = createSystemsList();
		game.setSystems(systems);

	}
	private List<StellarSystem> createSystemsList() {
		StellarSystem newSystem = createSystem();

		return new ArrayList<>(Arrays.asList(newSystem));
	}
	private StellarSystem createSystem() {
		StellarSystem newSystem = new StellarSystem();
		newSystem.setName("Céléno");
		newSystem.addStar();
		newSystem.addStar();
		newSystem.addPlanet();
		newSystem.addPlanet();
		newSystem.addPlanet();
		newSystem.addPlanet();

		newSystem.displayConsole();

		return newSystem;
	}

	private void uploadGame() {
		database = FirebaseDatabase.getInstance();
		myRef = database.getReference("users");
		myRef.setValue(game);
	}
}
