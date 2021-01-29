package gui;

import javax.swing.JPanel;

import data.Map;
import process.ElementManager;

public class GuiMap extends JPanel {
	Map map;
	ElementManager manager;
	public GuiMap(Map map, ElementManager manager) {
		this.map=map;
		this.manager=manager;

	}
}
