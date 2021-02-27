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

	public void droneVision(Map map) {
		int droneColumn = drone.getPosition().getColumn();
		int droneLine = drone.getPosition().getLine();
		Element[][] visionElements = new Element[SimulationParameters.NUMBER_OF_HEIGHT_SQUARES][SimulationParameters.NUMBER_OF_WIDTH_SQUARES];
		for (int indexLine = 0; indexLine < SimulationParameters.NUMBER_OF_HEIGHT_SQUARES; indexLine++) {
			for (int indexColumn = 0; indexColumn < SimulationParameters.NUMBER_OF_WIDTH_SQUARES; indexColumn++) {
				visionElements[indexLine][indexColumn]=map.getElementsInMap()[droneLine+indexLine][droneColumn+indexColumn];
			}
		}
		map.setVisionDrone(visionElements);		
	}
	
}
