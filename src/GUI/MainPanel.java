package GUI;

import java.awt.Dimension;

import javax.swing.JFrame;

import config.GuiData;



public class MainPanel extends JFrame implements Runnable {
	
	private final static Dimension preferredSize = new Dimension(GuiData.WINDOW_WIDTH,GuiData.WINDOW_HEIGHT);
	public MainPanel (String title) {
		super(title);
		init();
	}

	private void init() {
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
