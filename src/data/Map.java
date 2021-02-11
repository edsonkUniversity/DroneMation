package data;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.Position;

public class Map {
	
	private int cases[][];
	private ArrayList<Tree> trees;
	private ArrayList<Fire> fire;
	private ArrayList<House> house;
	private String name;
	private Drone drone;
	
	
	public Map(int[][] cases, String name, Drone drone) {
		this.cases = cases;
		this.name = "Carte";
		this.drone = drone;
		this.trees=new ArrayList<Tree>();
		this.fire=new ArrayList<Fire>();
		this.house=new ArrayList<House>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Drone getDrone() {
		return drone;
	}

	public void setDrone(Drone drone) {
		this.drone = drone;
	}

	public int[][] getCases() {
		return cases;
	}

	public void setCases(int[][] cases) {
		this.cases = cases;
	}

	public ArrayList<Tree> getTrees() {
		return trees;
	}

	public void setTrees(ArrayList<Tree> trees) {
		this.trees = trees;
	}

	public ArrayList<Fire> getFire() {
		return fire;
	}

	public void setFire(ArrayList<Fire> fire) {
		this.fire = fire;
	}

	public ArrayList<House> getHouse() {
		return house;
	}

	public void setHouse(ArrayList<House> house) {
		this.house = house;
	}
}
