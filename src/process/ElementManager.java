package process;

import data.*;

public class ElementManager {

	public static void moveRightDrone(Map map) {
		if (map.getDrone().getPosition().getColumn() < 3) {
			map.getDrone().getPosition().setColumn((map.getDrone().getPosition().getColumn() + 1));
		}
	}

	public static void moveLeftDrone(Map map) {
		if (map.getDrone().getPosition().getColumn() > 0) {
			map.getDrone().getPosition().setColumn((map.getDrone().getPosition().getColumn() -1));
		}
	}

	public static void moveForwardDrone(Map map) {
		if (map.getDrone().getPosition().getLigne() > 0) {
			map.getDrone().getPosition().setColumn((map.getDrone().getPosition().getLigne() - 1));
		}
	}

	public static void moveDownwardDrone(Map map) {
		if (map.getDrone().getPosition().getLigne() < 3) {
			map.getDrone().getPosition().setColumn((map.getDrone().getPosition().getLigne() + 1));
		}
	}

}
