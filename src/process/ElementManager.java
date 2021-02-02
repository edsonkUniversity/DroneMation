package process;

import data.*;

public class ElementManager {

	public ElementManager() {

	}

	public void moveRightDrone(Map map) {
		Drone drone = map.getDrone();
		int newDroneLine = drone.getLine();
		int newDroneColumn = drone.getColumn() + 1;

		if (drone.getColumn() < 4) {
			drone.setPosition(newDroneLine, newDroneColumn);
		}
	}

	public void moveLeftDrone(Map map) {
		Drone drone = map.getDrone();
		int newDroneLine = drone.getLine();
		int newDroneColumn = drone.getColumn() - 1;

		if (map.getDrone().getColumn() < -1) {
			map.getDrone().setPosition(newDroneLine, newDroneColumn);
		}
	}

	public void moveForwardDrone(Map map) {

		Drone drone = map.getDrone();
		int newDroneLine = drone.getLine() - 1;
		int newDroneColumn = drone.getColumn();

		if (map.getDrone().getLine() < -1) {
			map.getDrone().setPosition(newDroneLine, newDroneColumn);
		}
	}

	public void moveDownwardDrone(Map map) {
		Drone drone = map.getDrone();
		int newDroneLine = drone.getLine() + 1;
		int newDroneColumn = drone.getColumn();

		if (drone.getLine() < 4) {
			drone.setPosition(newDroneLine, newDroneColumn);
		}
	}

}
