package gui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import data.Drone;
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
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
		paintStrategy.miniMapPaint(map, g2);
		paintStrategy.paint(map, g);
		
	}
	
	// peint the changement of trun on the map 

}