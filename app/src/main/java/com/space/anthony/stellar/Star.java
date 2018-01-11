package com.space.anthony.stellar;

import java.util.Map;

/**
 * Created by Anthony on 11/01/2018.
 */

public class Star {
	// informal
		private String name;
		private String designation;
	// formal
		private int brightness;
		private int color;
		private Map<String, Float> composition;
		private short radius;
		private int temperature;

	// getters
		public String getName() { return name; }
		public String getDesignation() { return designation; }

		public int getBrightness() { return brightness; }
		public int getColor() { return color; }
		public Map<String, Float> getComposition() { return composition; }
		public short getRadius() { return radius; }
		public int getTemperature() { return temperature; }

	// setters
		public void setName(String name) { this.name = name; }
		public void setDesignation(String designation) { this.designation = designation; }

		public void setBrightness(int brightness) { this.brightness = brightness; }
		public void setColor(int color) { this.color = color; }
		public void setComposition(Map<String, Float> composition) { this.composition = composition; }
		public void setRadius(short radius) { this.radius = radius; }
		public void setTemperature(int temperature) { this.temperature = temperature; }

	public Star() {}
}
