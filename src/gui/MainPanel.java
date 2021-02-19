package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import config.GuiData;
import data.Drone;
import data.Map;
import process.ElementManager;
import process.MapBuiler;

public class MainPanel extends JFrame implements Runnable {
	private Map map;
	
	private static final long serialVersionUID = 1L;
	private GuiMap dashboard;
	private final static Dimension preferredSize = new Dimension(GuiData.WINDOW_WIDTH, GuiData.WINDOW_HEIGHT);

	public MainPanel(String title) {
		super(title);
		this.setPreferredSize(preferredSize);

		/*
		 * initialDroneVision = new Zone[5][5]; Drone drone = new Drone("Le Drone", 0,
		 * 0, initialDroneVision); map = new Map("Carte Test", drone,
		 * initialDroneVision);
		 */

		init();
		run();
	}

	private void init() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		KeyControls keyControls = new KeyControls();
		JTextField textField = new JTextField();
		textField.addKeyListener(keyControls);
		MapBuiler newMapBuiler=  new MapBuiler();	
		map =newMapBuiler.getMap();
		dashboard= new GuiMap(map);
	//	dashboard.repaint(getGraphics());
		dashboard.setPreferredSize(preferredSize);
		contentPane.add(dashboard, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setPreferredSize(preferredSize);
		setResizable(false);
		
		JFrame treePopUp = createPopUp(GuiData.TREE_TEXT_TITLE, GuiData.TREE_TEXT);
		treePopUp.setVisible(true);
		JFrame forestPopUp = createPopUp(GuiData.FOREST_TEXT_TITLE, GuiData.FOREST_TEXT);
		forestPopUp.setVisible(true);
		JFrame forestFirePopUp = createPopUp(GuiData.FOREST_FIRE_TEXT_TITLE, GuiData.FOREST_FIRE_TEXT);
		forestFirePopUp.setVisible(true);
	}
	
	public JFrame createPopUp(String titleText, String textPopUp) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(300,300);
		jFrame.setTitle(titleText);
		JTextArea jTextArea = new JTextArea(textPopUp);
		jTextArea.setEnabled(false);
		jTextArea.setForeground(Color.WHITE);
		jTextArea.setLineWrap(true);
		jTextArea.setBackground(Color.BLACK);
		jFrame.add(jTextArea);
		return jFrame;
	}

	public void run() {
		// TODO Auto-generated method stub
		// actualization(map);
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

			dashboard.repaint();
		}
	}

	private class KeyControls implements KeyListener {

		@Override
		public void keyPressed(KeyEvent event) {
			switch (event.getKeyCode()) {
			case KeyEvent.VK_UP:
				ElementManager.moveForwardDrone(map);
				break;
			case KeyEvent.VK_DOWN:
				ElementManager.moveDownwardDrone(map);
				break;
			case KeyEvent.VK_RIGHT:
				ElementManager.moveRightDrone(map);
				break;
			case KeyEvent.VK_LEFT:
				ElementManager.moveLeftDrone(map);
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