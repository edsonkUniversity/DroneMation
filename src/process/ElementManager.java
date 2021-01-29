package process;

import data.*;

public class ElementManager {	 
	
	public ElementManager() {
	
	}
	
	
	public void moveRightDrone(Map map) {
		
		if (map.getDrone().getColumn() < 5) {
			map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getLine()+1);
		}
	}
	
	public void moveLeftDrone(Map map) {
		if (map.getDrone().getColumn() < -1) {
			map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getLine()-1);
		}
		
	}
	
	/*
	public void moveForwardDrone(Map map) {

		if (map.getDrone().getLine()() < 5) {
			map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getLine()+1);
		}
	}
	
	public void moveDownwardDrone(Map map) {

		if (map.getDrone().getColumn() < 5) {
			map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getLine()+1);
		}
	}
	*/
	
}
