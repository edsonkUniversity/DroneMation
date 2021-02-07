package test;

import javax.swing.JFrame;

import config.SimulationParameters;
import data.Drone;
import data.Element;
import data.Position;
import gui.MainPanel;
import process.MapBuiler;

public class TestGUI {

	public static void main(String[] args) {
		Position position =new Position(1,2);
		Element element = new Drone(position);
		//System.out.println(element.getPositions());
		MapBuiler mapBuilder= new MapBuiler();
		mapBuilder.voidInitSuaresTab();
		
		int [][] n=mapBuilder.getSquaresWhithCode();
		
		String g="";
		
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				g+=" "+String.valueOf(n[i][j]);
			}
			System.out.println(g);
			g="";
			System.out.println(" \n ");
		}

	}
}
