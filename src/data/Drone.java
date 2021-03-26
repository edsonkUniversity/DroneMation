package data;

import java.awt.*;
import java.util.ArrayList;

public class Drone extends Element {
	private int locationX;
	private int locationY;
	

	private ArrayList<Forest>[][] detectionForest;
	//private HashMap<Position, Forest[]> detectForest = new HashMap<Position, Forest[]>();

	public Drone(Position position) {
		super(position, Color.CYAN);
		locationX=0;
		locationY=0;
	}

	public ArrayList<Forest> getDetectionForest(int x, int y) {
		return detectionForest[x][y];
	}


}