package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Drone;
import data.Map;
import data.Zone;

public class PaintStrategy {
	private BufferedImage image;

	public void paint(Map map, Graphics g, JPanel panel) {
		int droneColumn = map.getDrone().getColumn();
		int droneLine = map.getDrone().getLine();
		Zone[][] dronePositions = map.getPositions();
		File droneImg = dronePositions[droneLine][droneColumn].getImg();


		try {
			image = ImageIO.read(droneImg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		g.drawImage(image, 0, 0, panel);

	}

}
