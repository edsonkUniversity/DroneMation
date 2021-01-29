package data;

import java.util.HashMap;

import javax.swing.text.Position;

public class Map {
	
	private Zone[][] zones;
	private String name;
	
	public Map(Zone[][] zones, String name) {
		this.zones = zones;
		this.name = name;
	}

	public Zone[][] getPositions() {
		return zones;
	}

	public void setPositions(Zone[][] zones) {
		this.zones = zones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
