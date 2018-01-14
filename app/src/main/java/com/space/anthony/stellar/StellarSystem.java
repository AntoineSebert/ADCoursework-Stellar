package com.space.anthony.stellar;

import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Anthony on 11/01/2018.
 */

public class StellarSystem {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		// informal --------------------------------------------------------------------------------
			private String name;
			private List<Planet> planets;
			private List<Star> stars;
		// formal ----------------------------------------------------------------------------------
			private String designation;
			private long posx;
			private long posy;
			private boolean rotationDirection;
	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// PUBLIC ==================================================================================
			// constructor -------------------------------------------------------------------------
				public StellarSystem() {
					planets = new ArrayList<>();
					stars = new ArrayList<>();
				}
			// getters -----------------------------------------------------------------------------
				// informal
					public String getName() { return name; }
					public List<Planet> getPlanets() { return planets; }
					public List<Star> getStars() { return stars; }
				// formal
					public String getDesignation() { return designation; }
					public long getPosx() { return posx; }
					public long getPosy() { return posy; }
					public boolean isRotationDirection() { return rotationDirection; }
			// setters -----------------------------------------------------------------------------
				// informal
					public void setName(String name) {
						this.name = name;
						createAndSetDesignation();
						if (0 < stars.size()) {
							int index = 0;
							for (Star star: stars)
								star.setName(name + '-' + (char)(++index + 65));
						}
						if (0 < planets.size()) {
							int index = 0;
							for (Planet planet : planets)
								planet.setName(name + '-' + Tools.integerToRomanNumeral(index + 1));
						}
					}
					public void setPlanets(List<Planet> planets) { this.planets = planets; }
					public void setStars(List<Star> stars) { this.stars = stars; }
				// formal
					public void setPosx(long posx) { this.posx = posx; }
					public void setPosy(long posy) { this.posy = posy; }
					public void setRotationDirection(boolean rotationDirection) {
						this.rotationDirection = rotationDirection;
					}
			// modifier ----------------------------------------------------------------------------
				public void addStar() {
					if (name != null) {
						stars.add(new Star());
						stars.get(stars.size() - 1).setName(name + '-' + (char)(stars.size() + 64));
					}
					else
						Log.e(this.getClass().toString(), "Stellar system name has not been set");
				}
				public void addPlanet() {
					if (name != null) {
						planets.add(new Planet());
						planets.get(planets.size() - 1).setName(name + '-' + Tools.integerToRomanNumeral(planets.size()));
					}
					else
						Log.e(this.getClass().toString(), "Stellar system name has not been set");
				}
			// display -----------------------------------------------------------------------------
				public void displayConsole() {
					Log.d("=====",name + " : " + designation + '\n');
					if (0 < stars.size()) {
						for (Star star: stars)
							Log.d("=====", star.getName() + " : " + star.getDesignation() + '\n');
					}
					if (0 < planets.size()) {
						for (Planet planet : planets)
							Log.d("=====", planet.getName() + " : " + planet.getDesignation() + '\n');
					}
				}
		// PRIVATE =================================================================================
			private void createAndSetDesignation() {
				this.designation = Game.getDesignationHead() + '-' + name;
			}
}
