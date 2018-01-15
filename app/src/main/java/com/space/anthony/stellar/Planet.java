package com.space.anthony.stellar;

import java.util.Map;

/**
 * Created by Anthony on 11/01/2018.
 */

public class Planet {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		// informal --------------------------------------------------------------------------------
			private String name;
			private String designation;
			private Satellite [] satellites;
		// formal ----------------------------------------------------------------------------------
			private int color;
			private Map<String, Float> composition;
			private long mass;
			private int orbitalDistance;
			private int radius;
			private int velocity;
			private boolean rotationDirection;
		// gameplay --------------------------------------------------------------------------------
			private long biomass;
			private float eventProbability;
			private float temperature;
			public class Satellite {
				// informal
				private String name;
				private String designation;
			}
	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// PUBLIC ==================================================================================
			// constructor -------------------------------------------------------------------------
				public Planet() {}
			// getters -----------------------------------------------------------------------------
				// informal
					public String getName() { return name; }
					public String getDesignation() { return designation; }
					public Satellite[] getSatellite() { return satellites; }
				// formal
					public int getColor() { return color; }
					public Map<String, Float> getComposition() { return composition; }
					public long getMass() { return mass; }
					public int getOrbitalDistance() { return orbitalDistance; }
					public int getRadius() { return radius; }
					public boolean isRotationDirection() { return rotationDirection; }
					public int getVelocity() { return velocity; }
			// setters -----------------------------------------------------------------------------
				// informal
					public void setName(String name) {
						this.name = name;
						createAndSetDesignation();
					}
					public void setSatellite(Satellite[] satellites) { this.satellites = satellites; }
				// formal
					public void setColor(int color) { this.color = color; }
					public void setComposition(Map<String, Float> composition) {
						this.composition = composition;
					}
					public void setMass(long mass) { this.mass = mass; }
					public void setOrbitalDistance(int orbitalDistance) {
						this.orbitalDistance = orbitalDistance;
					}
					public void setRadius(int radius) { this.radius = radius; }
					public void setRotationDirection(boolean rotationDirection) {
						this.rotationDirection = rotationDirection;
					}
					public void setVelocity(int velocity) { this.velocity = velocity; }
		// PRIVATE =================================================================================
			private void createAndSetDesignation() {
				this.designation = Game.getDesignationHead() + '-' + name;
			}
}