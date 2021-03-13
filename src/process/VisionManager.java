package process;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import config.SimulationParameters;
import data.Drone;
import data.Element;
import data.Map;
import data.Position;
import data.Tree;

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

	/**
	 * Cette Methode indique si le drone a fait une detection de la partie affiché
	 * Methode appelé dans PaintStategy
	 * @param map
	 * @return
	 */
	public boolean isDetected(Map map) {
		boolean detect;
		Position dronePosition = drone.getPosition();
		/**
		 *  Le Objet Position dronePosition represente la position
		 *  en haut a gouche de chaque vision du drone.
		 */
		if(drone.getDetectForest().containsKey(dronePosition)) { 
			detect = true;
			detectedDroneVision(map);
		}else {
			detect = false;
			droneVision(map);
			//a faire detection
			
		}
		return detect;
	}
	
	/**
	 * Cette methode affiche la carte du drone avec les elements (Arbre) precedement détecté d'une couleurs differente.
	 * Methode appelé dans isDetected()
	 * @param map
	 */
	public void detectedDroneVision(Map map) {
		int droneColumn = drone.getPosition().getColumn();
		int droneLine = drone.getPosition().getLine();
		Element[][] visionElements = new Element[SimulationParameters.NUMBER_OF_HEIGHT_SQUARES][SimulationParameters.NUMBER_OF_WIDTH_SQUARES];
		for (int indexLine = 0; indexLine < SimulationParameters.NUMBER_OF_HEIGHT_SQUARES; indexLine++) {
			for (int indexColumn = 0; indexColumn < SimulationParameters.NUMBER_OF_WIDTH_SQUARES; indexColumn++) {
				if (visionElements[indexLine][indexColumn].getColor().equals(Color.green)) {
					Tree tree = (Tree) visionElements[indexLine][indexColumn];
					if(tree.isVisit()) {
						visionElements[indexLine][indexColumn].setColor(new Color(74, 100, 50));
					}
				}
				visionElements[indexLine][indexColumn] = map.getElementsInMap()[droneLine+indexLine][droneColumn+indexColumn];
			}
		}
		map.setVisionDrone(visionElements);		
	}
}
