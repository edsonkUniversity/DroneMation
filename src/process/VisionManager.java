package process;

import java.awt.Color;

import config.SimulationParameters;
import data.Drone;
import data.Element;
import data.Map;
import data.Position;

public class VisionManager {
	private Map map;
	private Drone drone;
	private Position firstPositionV;
	private Position lastPositionV;

	public VisionManager(Map map, Drone drone) {
		this.map = map;
		this.drone = drone;
		firstPositionV = new Position(drone.getPosition().getColumn() - SimulationParameters.NUMBER_OF_WIDTH_SQUARES,
				drone.getPosition().getColumn() - SimulationParameters.NUMBER_OF_WIDTH_SQUARES);
		lastPositionV = new Position(drone.getPosition().getColumn() + SimulationParameters.NUMBER_OF_WIDTH_SQUARES,
				drone.getPosition().getColumn() + SimulationParameters.NUMBER_OF_WIDTH_SQUARES);
	}

	public String detectionTree(Element element) {
		String isTree="C'est pas un arbre";
		if (element.getColor().equals(Color.GREEN)) {
			isTree="C'est un arbre";
		}
		return isTree;
	}

}
