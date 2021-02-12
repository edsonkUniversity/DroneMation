package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import config.GuiData;
import data.Drone;
import data.Element;
import data.Map;

public class PaintStrategy {
	private int sizeOfRect = 0;

	public void paint(Map map, Graphics g) {
		// recupreation of the vision by drone
		Element[][] droneVision = map.getVisionDrone();
		// size of one rectangle
		sizeOfRect = GuiData.WINDOW_WIDTH / GuiData.NUMBER_COLUMB;

		for (int line = 0; line < droneVision.length; line++) {
			for (int columb = 0; columb < droneVision.length; columb++) {

				int x = droneVision[line][columb].getPosition().getLine();
				int y = droneVision[line][columb].getPosition().getColumn();

				g.setColor(droneVision[line][columb].getColor());
				g.fillRect(x, y, line, columb);
			}

		}

	}
}
