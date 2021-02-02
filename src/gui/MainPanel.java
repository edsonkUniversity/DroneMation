package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import config.GuiData;
import data.Drone;
import data.Map;
import data.Zone;
import process.ElementManager;

public class MainPanel extends JFrame implements Runnable {
	private Map map;
	private Zone[][] initialDroneVision;
	private static final long serialVersionUID = 1L;
	private ElementManager elementManager;
	private GuiMap dashboard;
	private final static Dimension preferredSize = new Dimension(GuiData.WINDOW_WIDTH, GuiData.WINDOW_HEIGHT);

	public MainPanel(String title) {
		super(title);
		this.setPreferredSize(new Dimension(316, 355));

		initialDroneVision = new Zone[5][5];
		elementManager = new ElementManager();
		Drone drone = new Drone("Le Drone", 0, 0, initialDroneVision);
		map = new Map("Carte Test", drone, initialDroneVision);
		init();
		run();
	}

	private void init() {

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		KeyControls keyControls = new KeyControls();
		JTextField textField = new JTextField();
		textField.addKeyListener(keyControls);
		contentPane.add(textField, BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		dashboard = new GuiMap(map, elementManager);
		contentPane.add(dashboard);
		pack();
		setVisible(true);
		setPreferredSize(preferredSize);
		setResizable(false);

	}

	public void run() {
		// TODO Auto-generated method stub
		// actualization(map);
		while (true) {
			try {
				System.out.println(map.getDrone().toString());
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

			dashboard.repaint();
		}
	}

	private class KeyControls implements KeyListener {

		@Override
		public void keyPressed(KeyEvent event) {
			char keyChar = event.getKeyChar();
			switch (keyChar) {

			case 'z':
				elementManager.moveForwardDrone(map);
				break;
			case 's':
				elementManager.moveDownwardDrone(map);
				break;
			case 'd':
				elementManager.moveRightDrone(map);
				break;
			case 'q':
				elementManager.moveLeftDrone(map);
				break;
			default:
				break;
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {

		}
	}
}