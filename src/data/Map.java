package data;

import java.io.File;
import java.util.HashMap;

import javax.swing.text.Position;

public class Map {
	
	private Zone[][] zones;
	private String name;
	
	public Map(Zone[][] zones, String name) {
		this.zones = zones;
		this.name = name;
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
	public void initZone() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				Zone temp = new Zone(i,j);
				temp.setImg(new File("img/segment/"+i+"-"+j+".png"));
				zones[i][j]=temp;
			}
		}
	}
}
