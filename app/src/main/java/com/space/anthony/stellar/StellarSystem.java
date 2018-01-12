package com.space.anthony.stellar;

import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Calendar;

/**
 * Created by Anthony on 11/01/2018.
 */

public class StellarSystem {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		// PRIVATE
			// informal
				private String name;
				private Planet [] planets;
				private Star [] stars;
			// formal
				private String designation;
				private boolean rotationDirection;

	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// PUBLIC
			// getters
				// informal
					public String getName() { return name; }
					public Planet[] getPlanets() { return planets; }
					public Star[] getStars() { return stars; }
				// formal
					public boolean isRotationDirection() { return rotationDirection; }
			// setters
				// informal
					public void setName(String name) {
						this.name = name;
						createAndSetDesignation(name);
						stars = new Star[]{};
						Log.d("==================", Integer.toString(stars.length));
						/*
						if (0 < stars.length) {
							int index = 0;
							for (Star star: stars)
								star.setName(name + '-' + (char)(++index + 65));
						}
						*/
					}
					public void setPlanets(Planet[] planets) { this.planets = planets; }
					public void setStars(Star[] stars) { this.stars = stars; }
				// formal
					public String getDesignation() { return designation; }
					public void setRotationDirection(boolean rotationDirection) {
						this.rotationDirection = rotationDirection;
					}
		// PRIVATE
			private void createAndSetDesignation(String name) {
				this.designation = "SSC" + '-' + name + '-' + Calendar.getInstance().get(Calendar.YEAR);
			}

	public StellarSystem() {}
}
