package com.space.anthony.stellar;

import java.util.Map;

/**
 * Created by Anthony on 11/01/2018.
 */

public class Star {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		// informal --------------------------------------------------------------------------------
			private String name;
			private String designation;
		// formal ----------------------------------------------------------------------------------
			private int brightness;
			private int color;
			private Map<String, Float> composition;
			private int radius;
			private int temperature;
	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// PUBLIC ==================================================================================
			// constructor -------------------------------------------------------------------------
				public Star() {}
			// getters -----------------------------------------------------------------------------
				// informal
					public String getName() { return name; }
					public String getDesignation() { return designation; }
				// formal
					public int getBrightness() { return brightness; }
					public int getColor() { return color; }
					public Map<String, Float> getComposition() { return composition; }
					public int getRadius() { return radius; }
					public int getTemperature() { return temperature; }
			// setters -----------------------------------------------------------------------------
				// informal
					public void setName(String name) {
						this.name = name;
						createAndSetDesignation();
					}
				// formal
					public void setBrightness(int brightness) { this.brightness = brightness; }
					public void setColor(int color) { this.color = color; }
					public void setComposition(Map<String, Float> composition) {
						this.composition = composition;
					}
					public void setRadius(int radius) { this.radius = radius; }
					public void setTemperature(int temperature) { this.temperature = temperature; }
		// PRIVATE =================================================================================
			private void createAndSetDesignation() {
				this.designation = Game.getDesignationHead() + '-' + name;
			}
}
