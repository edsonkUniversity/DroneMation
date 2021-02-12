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

	public GuiMap(Map map) {
		this.map = map;
		this.manager = manager;

	}
	// peint the changement of trun on the map 
	public void repaint(Graphics g) {
		paintStrategy.paint(map, g);
	}

}