package data;

import java.io.File;
import java.util.HashMap;

import javax.swing.text.Position;

public class Map {
	
	private Zone[][] zones;
	private String name;
	private Drone drone;
	
	public Map(String name, Drone drone) {
		this.zones = zones;
		this.name = name;
		this.drone=drone;
		initZone();
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
	
	
	public Drone getDrone() {
		return drone;
	}

	public void setDrone(Drone drone) {
		this.drone = drone;
	}

	public void initZone() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				Zone temp = new Zone(i,j);
				temp.setImg(new File("src/img/segment/"+i+"-"+j+".png"));
				zones[i][j]=temp;
			}
		}
	}
}
