package test;

import java.io.File;

import javax.swing.JFrame;

import data.Drone;
import data.Map;
import data.Zone;
import gui.MainPanel;
import process.ElementManager;
import process.MapBuiler;

public class TestGUI {

	public static void main(String[] args) {
		Drone drone=new Drone("Lecerc");
		Map map=new Map("Hola",drone);
		MapBuiler mapBuilder =new MapBuiler(map);	
		mapBuilder.mapCreation(map);
		ElementManager elementManager=new ElementManager();
		System.out.println("TEST : Position du Drone : ( "+map.getDrone().getColumn()+", "+map.getDrone().getLine()+" )");
		elementManager.moveRightDrone(map);
		elementManager.moveRightDrone(map);
		elementManager.moveRightDrone(map);
		elementManager.moveRightDrone(map);
		System.out.println("TEST : Position du Drone : ( "+map.getDrone().getColumn()+", "+map.getDrone().getLine()+" )");
		
		
		
		/*System.out.println("TEST : Position du Drone : ( "+map.getDrone().getColumn()+", "+map.getDrone().getLine()+" )");
		map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getLine()+1);
		System.out.println("TEST : Position du Drone : ( "+map.getDrone().getColumn()+", "+map.getDrone().getLine()+" )");
		map.getDrone().setPosition(map.getDrone().getLine(), map.getDrone().getLine()+1);
		System.out.println("TEST : Position du Drone : ( "+map.getDrone().getColumn()+", "+map.getDrone().getLine()+" )");*/
	}

}
