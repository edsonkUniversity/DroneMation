package data;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.text.Position;

public class Map {
	
	private Zone[][] zones =new Zone[1][1];
	private String name;
	private Drone drone;
	
	public Map(String name, Drone drone) {
		this.zones = zones;
		this.name = name;
		this.drone=drone;
	}

	public Zone[][] getZones() {
		return zones;
	}

	public void setZones(Zone[][] zones) {
		this.zones = zones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Drone getDrone() {
		return drone;
	}
	


	public void setDrone(Drone drone) {
		this.drone = drone;
	}
	


	
	
}
