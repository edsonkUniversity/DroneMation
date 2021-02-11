package gui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import data.Map;
import process.ElementManager;

public class GuiMap extends JPanel {
	
	private Map map;
	private ElementManager manager;
	private PaintStrategy paintStrategy = new PaintStrategy();

	public GuiMap(Map map, ElementManager manager) {
		this.map = map;
		this.manager = manager;

	}
	/*
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Coordonnées à compléter

		paintStrategy.paint(map, g, this);
	}
	*/

}