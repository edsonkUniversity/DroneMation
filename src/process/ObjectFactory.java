package process;

import java.awt.Color;

import config.GuiData;
import data.Drone;
import data.Fire;
import data.House;
import data.Position;
import data.Tree;

public class ObjectFactory {

	public ObjectFactory(){
		
	}
	
	public Drone createDrone(int line, int column) {
		Position position=new Position(line,column);
		return new Drone(position); 
	}
	
	public Fire createFire(int line,int column) {
		Position position=new Position(line,column);
		return new Fire(position, GuiData.FIRE_COLOR); 
	}
	
	public Tree createForest(int line,int column) {
		Position position=new Position(line,column);
		return new Tree(position, GuiData.TREE_COLOR); 
	}
	
	public House createHouse(int line,int column) {
		Position position=new Position(line,column);
		return new House(position, GuiData.TREE_COLOR); 
	}
}
