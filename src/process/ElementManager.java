package process;

import data.*;

public class ElementManager {	 
	
	private Zone zone;
	private Map map;
	
	public ElementManager(Map map) {
		this.map = map;
	}
	
	public void set(Zone zone) {
		this.zone = zone;
	}
	
	public void moveRightDrone() {

		if (zone.getColumn() < 5) {
			zone.setPosition(zone.getLine(), zone.getColumn()+1);
		}
	}
	
	public void moveLeftDrone() {

		if (zone.getColumn() < -1) { 
			zone.setPosition(zone.getLine(), zone.getColumn()-1);
		}
	}
	
	public void moveForwardDrone() {

		if (zone.getLine() < -1) { 
			zone.setPosition(zone.getLine()+1, zone.getColumn());
		}
	}
	
	public void moveDownwardDrone() {

		if (zone.getLine() < 5) { 
			zone.setPosition(zone.getLine()-300, zone.getColumn()+1);
		}
	}
	
}
