package com.space.anthony.stellar;

/**
 * Created by Anthony on 11/01/2018.
 */

public class StellarSystem {
	// informal
		private String name;
		private String designation;
		private Planet [] planets;
		private Star [] stars;
	// formal
		private boolean rotationDirection;

	// getters
		public String getName() { return name; }
		public String getDesignation() { return designation; }
		public Planet[] getPlanets() { return planets; }
		public Star[] getStars() { return stars; }

		public boolean isRotationDirection() { return rotationDirection; }

	// setters
		public void setName(String name) { this.name = name; }
		public void setDesignation(String designation) { this.designation = designation; }
		public void setPlanets(Planet[] planets) { this.planets = planets; }
		public void setStars(Star[] stars) { this.stars = stars; }

		public void setRotationDirection(boolean rotationDirection) { this.rotationDirection = rotationDirection; }

	public StellarSystem() {}
}
