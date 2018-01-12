package com.space.anthony.stellar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Anthony on 11/01/2018.
 */

public class StellarSystem {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		// PRIVATE
			// informal
				private String name;
				private List<Planet> planets;
				private List<Star> stars;
			// formal
				private String designation;
				private boolean rotationDirection;
	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// PUBLIC
			// getters
				// informal
					public String getName() { return name; }
					public List<Planet> getPlanets() { return planets; }
					public List<Star> getStars() { return stars; }
				// formal
					public boolean isRotationDirection() { return rotationDirection; }
			// setters
				// informal
					public void setName(String name) {
						this.name = name;
						createAndSetDesignation(name);
						if (0 < stars.size()) {
							int index = 0;
							for (Star star: stars)
								star.setName(name + '-' + (char)(++index + 65));
						}
					}
					public void setPlanets(List<Planet> planets) { this.planets = planets; }
					public void setStars(List<Star> stars) { this.stars = stars; }
				// formal
					public String getDesignation() { return designation; }
					public void setRotationDirection(boolean rotationDirection) {
						this.rotationDirection = rotationDirection;
					}
		// PRIVATE
			private void createAndSetDesignation(String name) {
				this.designation = "SSC" + '-' + name + '-' + Calendar.getInstance().get(Calendar.YEAR);
			}

	public StellarSystem() {
		planets = new ArrayList<Planet>();
		stars = new ArrayList<Star>();
	}
}
