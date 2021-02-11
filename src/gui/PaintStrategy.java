package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Drone;
import data.Map;
import data.Zone;

public class PaintStrategy {

	/*
	public void paint(Map map, Graphics g, JPanel panel) {
		int droneColumn = map.getDrone().getColumn();
		int droneLine = map.getDrone().getLine();
		Zone[][] dronePositions = map.getPositions();
		String droneImg = dronePositions[droneLine][droneColumn].getImg();
		
		try {
			g.drawImage(readImage(droneImg), 0, 0, panel);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static Image readImage(String filePath) {
		try {
			return ImageIO.read(new File(filePath));
		} catch (IOException e) {
			System.err.println("-- Can not read the image file ! --");
			return null;
		}
	}
*/
}
