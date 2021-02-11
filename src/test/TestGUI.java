package test;

import javax.swing.JFrame;

import config.SimulationParameters;
import data.Drone;
import data.Element;
import data.Map;
import data.Position;
import gui.MainPanel;
import process.MapBuiler;

public class TestGUI {

	public static void main(String[] args) {
		
		/**
		 * Test de creation d'une Map 
		 */
		
		MapBuiler mapBuilder= new MapBuiler();
		String g="";
		Map map=mapBuilder.getMap();
		int [][] n=map.getCases();
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				g+=" "+String.valueOf(n[i][j]);
			}
			System.out.println(g);
			g="";
			System.out.println(" \n ");
		}
		/**
		 * Affichage du nombre de chaque element dans
		 *  la caarte 
		 */
		System.out.println("Number of Fire :"+map.getFire().size());
		System.out.println("Number of Houses :"+map.getHouse().size());
		System.out.println("Number of Trees :"+map.getTrees().size());
	}
	
}
