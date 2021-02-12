package process;

import config.GuiData;
import config.SimulationParameters;
import data.*;

public class ElementManager {

	public static void moveRightDrone(Map map) {
		if (map.getDrone().getPosition().getColumn() < GuiData.WINDOW_WIDTH - 1) {
			map.getDrone().getPosition().setColumn(
					(map.getDrone().getPosition().getColumn() + SimulationParameters.NUMBER_OF_WHIDTH_SQUARES));
		}
	}

	public static void moveLeftDrone(Map map) {
		if (map.getDrone().getPosition().getColumn() < 0) {
			map.getDrone().getPosition().setColumn(
					(map.getDrone().getPosition().getColumn() - SimulationParameters.NUMBER_OF_WHIDTH_SQUARES));
		}
	}

	public static void moveForwardDrone(Map map) {
		if (map.getDrone().getPosition().getLigne() > 0) {
			map.getDrone().getPosition().setColumn(
					(map.getDrone().getPosition().getLigne() - SimulationParameters.NUMBER_OF_HEIGHT_SQUARES));
		}
	}

	public static void moveDownwardDrone(Map map) {
		if (map.getDrone().getPosition().getLigne() < GuiData.WINDOW_HEIGHT - 1) {
			map.getDrone().getPosition().setColumn(
					(map.getDrone().getPosition().getLigne() + SimulationParameters.NUMBER_OF_HEIGHT_SQUARES));
		}
	}

}
