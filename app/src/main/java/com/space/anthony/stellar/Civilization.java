package com.space.anthony.stellar;

/**
 * Created by Anthony on 12/01/2018.
 */

public class Civilization {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		private String name;
		private long population;
		private long research;
		private long resources;
		private int year;
	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// constructor -----------------------------------------------------------------------------
			public Civilization() {}
		// getters ---------------------------------------------------------------------------------
			public String getName() { return name; }
			public long getPopulation() { return population; }
			public long getResearch() { return research; }
			public long getResources() { return resources; }
			public int getYear() { return year; }
		// setters ---------------------------------------------------------------------------------
			public void setName(String name) { this.name = name; }
			public void setPopulation(long population) { this.population = population; }
			public void setResearch(long research) { this.research = research; }
			public void setResources(long resources) { this.resources = resources; }
			public void setYear(int year) { this.year = year; }
}
