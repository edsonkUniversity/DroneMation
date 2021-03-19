package gui;

import java.awt.Color;
import java.awt.Graphics;

import config.GuiData;
import config.SimulationParameters;
import data.Element;
import data.Map;
import process.VisionManager;

public class PaintStrategy {
	private int sizeOfRect = 0;

	public void paint(Map map, Graphics g) {

		// recupreation of the vision by drone
		VisionManager visionManager =  new VisionManager(map, map.getDrone());

		visionManager.checkIfDetected(map);

		Element[][] droneVision = map.getVisionDrone();
		for (int line = 0; line < SimulationParameters.NUMBER_OF_HEIGHT_SQUARES; line++) {
			for (int column = 0; column < SimulationParameters.NUMBER_OF_WIDTH_SQUARES; column++) {
				if(droneVision[line][column]!=null) {
                    g.setColor(droneVision[line][column].getColor());
                    g.fillRect(line * GuiData.RECT_SIZE, column * GuiData.RECT_SIZE, GuiData.RECT_SIZE, GuiData.RECT_SIZE);
                    
                }
                g.setColor(Color.DARK_GRAY);
                g.drawLine(0, column*GuiData.RECT_SIZE, GuiData.WINDOW_HEIGHT, column*GuiData.RECT_SIZE);
                g.drawLine(line*GuiData.RECT_SIZE,0, line*GuiData.RECT_SIZE, GuiData.WINDOW_WIDTH);
                g.setColor(Color.white);
			}

		}

	}

}