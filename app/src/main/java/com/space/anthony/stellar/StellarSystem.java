package com.space.anthony.stellar;

/**
 * Created by Anthony on 11/01/2018.
 */

public class StellarSystem {
	// informal
		private String name;
		private String designation;
		private Planet [] planets;
	// formal
		private int brightness;
		private int color;
		private String [] composition;
		private short size;
		private int temperature;

	// getters
		public String getName() { return name; }
		public String getDesignation() { return designation; }
		public Planet[] getPlanets() { return planets; }

		public int getBrightness() { return brightness; }
		public int getColor() { return color; }
		public String[] getComposition() { return composition; }
		public short getSize() { return size; }
		public int getTemperature() { return temperature; }

	// setters
		public void setName(String name) { this.name = name; }
		public void setDesignation(String designation) { this.designation = designation; }
		public void setPlanets(Planet[] planets) { this.planets = planets; }

		public void setBrightness(int brightness) { this.brightness = brightness; }
		public void setColor(int color) { this.color = color; }
		public void setComposition(String[] composition) { this.composition = composition; }
		public void setSize(short size) { this.size = size; }
		public void setTemperature(int temperature) { this.temperature = temperature; }

	public class Planet {
		public String name;
		public short size;
		public int color;
	}

	public StellarSystem() {}

	public StellarSystem(String username, String email) {
	}

}
