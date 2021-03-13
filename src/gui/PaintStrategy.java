package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import config.GuiData;
import config.SimulationParameters;
import data.Drone;
import data.Element;
import data.Map;
import process.VisionManager;

public class PaintStrategy {
	private int sizeOfRect = 0;

	public void paint(Map map, Graphics g) {
		// recupreation of the vision by drone
		VisionManager visionManager =  new VisionManager(map, map.getDrone());
		visionManager.isDetected(map);
		Element[][] droneVision = map.getVisionDrone();
		for (int line = 0; line < SimulationParameters.NUMBER_OF_HEIGHT_SQUARES; line++) {
			for (int columb = 0; columb < SimulationParameters.NUMBER_OF_WIDTH_SQUARES; columb++) {
				if(droneVision[line][columb]!=null) {
                    g.setColor(droneVision[line][columb].getColor());
                    g.fillRect(line * GuiData.RECT_SIZE, columb * GuiData.RECT_SIZE, GuiData.RECT_SIZE, GuiData.RECT_SIZE);
                    
                }
                g.setColor(Color.DARK_GRAY);
                g.drawLine(0, columb*GuiData.RECT_SIZE, GuiData.WINDOW_HEIGHT, columb*GuiData.RECT_SIZE);
                g.drawLine(line*GuiData.RECT_SIZE,0, line*GuiData.RECT_SIZE, GuiData.WINDOW_WIDTH);
                g.setColor(Color.white);
			}

		}

	}
}