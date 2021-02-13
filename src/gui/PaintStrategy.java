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
		for (int line = 0; line < droneVision.length; line++) {
			for (int columb = 0; columb < droneVision.length; columb++) {

				// int x = droneVision[line][columb].getPosition().getLine();
				// int y = droneVision[line][columb].getPosition().getColumn();
				g.setColor(droneVision[line][columb].getColor());
				g.fillRect(line * GuiData.RECT_SIZE, columb * GuiData.RECT_SIZE, GuiData.RECT_SIZE, GuiData.RECT_SIZE);
				g.setColor(Color.DARK_GRAY);
				g.drawLine(0, columb*GuiData.RECT_SIZE, GuiData.WINDOW_HEIGHT, columb*GuiData.RECT_SIZE);
				g.drawLine(line*GuiData.RECT_SIZE,0, line*GuiData.RECT_SIZE, GuiData.WINDOW_WIDTH);
			}

		}

	}
}
