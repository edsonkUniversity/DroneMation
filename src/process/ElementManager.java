package process;

import data.*;

public class ElementManager {

	public static void moveRightDrone(Map map) {
		if (map.getDrone().getColumn() < 3) {
			map.getDrone().setColumn(map.getDrone().getColumn() + 1);
		}
	}

	public static void moveLeftDrone(Map map) {
		if (map.getDrone().getColumn() > 0) {
			map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getColumn() - 1);
		}
	}

	public static void moveForwardDrone(Map map) {
		if (map.getDrone().getLine() > 0) {
			map.getDrone().setLine(map.getDrone().getLine() - 1);
		}
	}

	public static void moveDownwardDrone(Map map) {
		if (map.getDrone().getLine() < 3) {
			map.getDrone().setLine(map.getDrone().getLine() + 1);
		}
	}

}
