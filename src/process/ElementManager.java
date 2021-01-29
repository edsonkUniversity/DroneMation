package process;

import data.Drone;

public class ElementManager {	 
	
	private Drone drone;
	
	public void set(Drone drone) {
		this.drone = drone;
	}
	
	public void moveRightDrone() {

		if (drone.getColumn() < 100 - 1) { //100 = valeur max weight du Jframe 
			drone.setPosition(drone.getLine(), drone.getColumn()+50); //50 = valeur de deplacement en px
		}
	}
	
}
