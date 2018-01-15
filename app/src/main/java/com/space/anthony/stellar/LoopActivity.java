package com.space.anthony.stellar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoopActivity extends AppCompatActivity {

	FirebaseDatabase database;
	DatabaseReference myRef;

	GameView gameView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new GameView(this));

		database = FirebaseDatabase.getInstance();
		myRef = database.getReference("message");

		myRef.addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot dataSnapshot) {
				Game userGame = dataSnapshot.getValue(Game.class);
			}
			@Override
			public void onCancelled(DatabaseError error) {
				Log.w("DATABASE", "Failed to read value.", error.toException());
			}
		});
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

	class GameView extends SurfaceView {
		Paint paint = null;
		public GameView(Context context) {
			super(context);
		}

		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			int x = getWidth();
			int y = getHeight();
			int radius;
			radius = 100;
			paint.setStyle(Paint.Style.FILL);
			paint.setColor(Color.WHITE);
			canvas.drawPaint(paint);
			// Use Color.parseColor to define HTML colors
			paint.setColor(Color.parseColor("#CD5C5C"));
			canvas.drawCircle(x / 2, y / 2, radius, paint);
		}
	}
}
