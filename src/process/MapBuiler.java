package process;

import java.util.ArrayList;

import config.SimulationParameters;
import data.Fire;
import data.House;
import data.Map;
import data.Tree;
import data.Zone;

public class MapBuiler {
	private int[][] freeSquares; 
	private int[][] SquaresWhithCode;
	private ArrayList<Tree> trees;
	private ArrayList<Fire> fire;
	private ArrayList<House> house;
	private Map resultMap;
	
	/**
	 * Code for Squares :
	 * 
	 *  1 Tree
	 * 	2 Fire
	 * 	3 House
	 * 
	 */
	
	public MapBuiler() {
		this.freeSquares =new int[SimulationParameters.NUMBER_OF_HEIGHT_SQUARES][SimulationParameters.NUMBER_OF_WHIDTH_SQUARES];
		this.SquaresWhithCode =new int[SimulationParameters.NUMBER_OF_HEIGHT_SQUARES][SimulationParameters.NUMBER_OF_WHIDTH_SQUARES];
		this.fire=new ArrayList<Fire>();
		this.house=new ArrayList<House>();
		this.trees=new ArrayList<Tree>();
	}
	
	
	public Map getMap() {
		
		return resultMap;
	}
	
	public void aDDTrees() {
		
	}
	
	public void aDDFire() {
		
	}
	
	public void aDDHouses() {
		
	}
	
	public void voidInitSuaresTab() {
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				this.SquaresWhithCode[i][j]=0;
				this.freeSquares[i][j]=0;
			}
		}	
	}


	public int[][] getFreeSquares() {
		return freeSquares;
	}


	public void setFreeSquares(int[][] freeSquares) {
		this.freeSquares = freeSquares;
	}


	public int[][] getSquaresWhithCode() {
		return SquaresWhithCode;
	}


	public void setSquaresWhithCode(int[][] squaresWhithCode) {
		SquaresWhithCode = squaresWhithCode;
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


	public Map getResultMap() {
		return resultMap;
	}


	public void setResultMap(Map resultMap) {
		this.resultMap = resultMap;
	}
	
/*
	public void  mapCreation(Map map) {
		Zone[][] zonesForMap=new Zone[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				Zone temp = new Zone(i,j,"src/img/segment/"+i+"-"+j+".png");
				zonesForMap[i][j]=temp;
				System.out.println("MAPBUILDER : Creation de la zone: ( "+i+", "+j+" ) avec l'adresse -> "+zonesForMap[i][j].getImg());
			}
		}
		//map.setZones(zonesForMap);
	}
	
	*/
}
