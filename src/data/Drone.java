package data;

import java.awt.*;
import java.util.HashMap;

public class Drone extends Element {
	private HashMap<Position, Forest[]> detectForest = new HashMap<Position, Forest[]>();

	public Drone(Position position) {
		super(position, Color.CYAN);
	}

	public HashMap<Position, Forest[]> getDetectForest() {
		return detectForest;
	}

	public void setDetectForest(HashMap<Position, Forest[]> detectForest) {
		this.detectForest = detectForest;
	}
}