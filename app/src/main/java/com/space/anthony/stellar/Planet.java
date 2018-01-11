package com.space.anthony.stellar;

import java.util.Map;

/**
 * Created by Anthony on 11/01/2018.
 */

public class Planet {
	// informal
		private String name;
		private String designation;
		private Satellite [] satellites;
	// formal
		private int albedo;
		private int color;
		private Map<String, Float> composition;
		private long mass;
		private int orbitalDistance;
		private short radius;
		private int velocity;
		private boolean rotationDirection;

	// getters
		public String getName() { return name; }
		public String getDesignation() { return designation; }
		public Satellite[] getSatellite() { return satellites; }

		public int getAlbedo() { return albedo; }
		public int getColor() { return color; }
		public Map<String, Float> getComposition() { return composition; }
		public long getMass() { return mass; }
		public int getOrbitalDistance() { return orbitalDistance; }
		public short getRadius() { return radius; }
		public boolean isRotationDirection() { return rotationDirection; }
		public int getVelocity() { return velocity; }

	// setters
		public void setName(String name) { this.name = name; }
		public void setDesignation(String designation) { this.designation = designation; }
		public void setSatellite(Satellite[] satellites) { this.satellites = satellites; }

		public void setAlbedo(int albedo) { this.albedo = albedo; }
		public void setColor(int color) { this.color = color; }
		public void setComposition(Map<String, Float> composition) { this.composition = composition; }
		public void setMass(long mass) { this.mass = mass; }
		public void setOrbitalDistance(int orbitalDistance) { this.orbitalDistance = orbitalDistance; }
		public void setRadius(short radius) { this.radius = radius; }
		public void setRotationDirection(boolean rotationDirection) { this.rotationDirection = rotationDirection; }
		public void setVelocity(int velocity) { this.velocity = velocity; }

	public Planet() {}



	public class Satellite {
		// informal
			private String name;
			private String designation;
	}
}