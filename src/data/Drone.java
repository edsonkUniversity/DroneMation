package data;

import java.io.File;

public class Drone {
	private String name;
	private int line;
	private int column;
	private Zone[][] vision;
	
	public Drone(String name, int line, int column, Zone[][] visionOfStart) {
		super();
		this.name = name;
		this.line = line;
		this.column = column;
		this.vision=visionOfStart;
	}

	public Drone(String name) {
		this.name=name;
		this.line = 0;
		this.column = 0;
		Zone[][] zonesForDroneVision=new Zone[1][1];
		for(int i=0; i<1; i++) {
			for(int j=0; j<1; j++) {
				Zone temp = new Zone(i,j,"src/img/segment/"+i+"-"+j+".png");
				zonesForDroneVision[i][j]=temp;
			}
		}
		
		this.vision=zonesForDroneVision;
	}
	
	public void setPosition(int line, int column) {
		this.line = line;
		this.column = column;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Zone[][] getVision() {
		return vision;
	}

	public void setVision(Zone[][] vision) {
		this.vision = vision;
	}
	
	
	
	public String toString() {
		 return "[line=" + line + ", column=" + column + "]";
	}
	
}