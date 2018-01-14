package com.space.anthony.stellar;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Anthony on 11/01/2018.
 */

public class Game {
	// ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
		private Civilization civilization;
		private List<StellarSystem> systems;
	// METHODS /////////////////////////////////////////////////////////////////////////////////////
		// constructor -----------------------------------------------------------------------------
			public Game() {}
		// getters
			public Civilization getCivilization() { return civilization; }
			public List<StellarSystem> getSystems() { return systems; }
			static public String getDesignationHead() {
				return "SSC-" + Calendar.getInstance().get(Calendar.YEAR)
					+ Calendar.getInstance().get(Calendar.MONTH);
			}
		// setters
			public void setCivilization(Civilization civilization) { this.civilization = civilization; }
			public void setSystems(List<StellarSystem> systems) { this.systems = systems; }

}
