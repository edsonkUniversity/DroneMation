package process;

import java.awt.Color;
import java.util.ArrayList;

import config.SimulationParameters;
import data.Drone;
import data.Fire;
import data.House;
import data.Map;
import data.Position;
import data.Tree;


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
	 *  5 : Tree
	 * 	2 : Fire
	 * 	3 : House
	 * 
	 */
	
	public MapBuiler() {
		this.freeSquares =new int[SimulationParameters.NUMBER_OF_HEIGHT_SQUARES][SimulationParameters.NUMBER_OF_WHIDTH_SQUARES];
		this.SquaresWhithCode =new int[SimulationParameters.NUMBER_OF_HEIGHT_SQUARES][SimulationParameters.NUMBER_OF_WHIDTH_SQUARES];
		this.fire=new ArrayList<Fire>();
		this.house=new ArrayList<House>();
		this.trees=new ArrayList<Tree>();
		this.resultMap=new Map(SquaresWhithCode,"Carte_Proto",new Drone(new Position(25,25)));
	}
	
	public Map getMap() {
		voidInitSuaresTab();
		generateTrees();
		generateHauses();
		generateFire();
		putTrees();
		putHouses();
		putFire();
		resultMap.setHouse(house);
		resultMap.setTrees(trees);
		resultMap.setFire(fire);
		resultMap.setCases(freeSquares);
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
	
	public void generateTrees() {
		int i=0;
		while(i<4) {
			int randomHightP =(int) (Math.random() * ( SimulationParameters.NUMBER_OF_HEIGHT_SQUARES - 10 + 1) + 10); 
			int randomWhightP =(int) (Math.random() * ( SimulationParameters.NUMBER_OF_WHIDTH_SQUARES - 10 + 1) + 10); 
			if(randomHightP+10< SimulationParameters.NUMBER_OF_HEIGHT_SQUARES && randomWhightP+10< SimulationParameters.NUMBER_OF_WHIDTH_SQUARES) {
				if( (randomHightP>1) && (randomWhightP>1)) {
				SquaresWhithCode[randomHightP][randomWhightP]=5;
				freeSquares[randomHightP][randomWhightP]=1;
				
				SquaresWhithCode[randomHightP][randomWhightP+1]=5;
				freeSquares[randomHightP][randomWhightP+1]=1;
				
				SquaresWhithCode[randomHightP][randomWhightP-1]=5;
				freeSquares[randomHightP][randomWhightP-1]=1;
				
				SquaresWhithCode[randomHightP+1][randomWhightP]=5;
				freeSquares[randomHightP+1][randomWhightP]=1;
				
				SquaresWhithCode[randomHightP-1][randomWhightP]=5;
				freeSquares[randomHightP-1][randomWhightP]=1;
				
				SquaresWhithCode[randomHightP-1][randomWhightP+1]=5;
				freeSquares[randomHightP-1][randomWhightP+1]=1;
				
				SquaresWhithCode[randomHightP-1][randomWhightP-1]=5;
				freeSquares[randomHightP-1][randomWhightP-1]=1;
				
				SquaresWhithCode[randomHightP-1][randomWhightP-2]=5;
				freeSquares[randomHightP-1][randomWhightP-2]=1;
				
				SquaresWhithCode[randomHightP-2][randomWhightP-1]=5;
				freeSquares[randomHightP-2][randomWhightP-1]=1;
				
				SquaresWhithCode[randomHightP-2][randomWhightP-2]=5;
				freeSquares[randomHightP-2][randomWhightP-2]=1;
				
				SquaresWhithCode[randomHightP-1][randomWhightP-2]=5;
				freeSquares[randomHightP-1][randomWhightP-2]=1;
				i++;
				}
			}
		}
	}
	
	public void  generateHauses() {	
		int i=0;
		while(i<20) {
			int randomHightP =(int) (Math.random() * ( SimulationParameters.NUMBER_OF_HEIGHT_SQUARES - 1 + 1) + 1); 
			int randomWhightP =(int) (Math.random() * ( SimulationParameters.NUMBER_OF_WHIDTH_SQUARES - 1 + 1) + 1); 
			if(randomHightP+10< SimulationParameters.NUMBER_OF_HEIGHT_SQUARES && randomWhightP+10< SimulationParameters.NUMBER_OF_WHIDTH_SQUARES) {
				if(freeSquares[randomHightP][randomWhightP]==0) {
					SquaresWhithCode[randomHightP][randomWhightP]=3;
					freeSquares[randomHightP][randomWhightP]=1;
					i++;
				}
			}
		
		}
	}
	public void  generateFire() {	
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				if(SquaresWhithCode[i][j]==5) {
					int randomFire =(int) (Math.random() * ( 3 - 1 + 1) + 1);
					if(randomFire==1) {
						SquaresWhithCode[i][j]=2;
					}
				}
			}
		}
	}
	
	public void  putTrees() {
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				if(SquaresWhithCode[i][j]==5) {
					Position position=new Position(i,j);
					Tree tree=new Tree(position,Color.GREEN);
					trees.add(tree);
				}
			}
		}
	}
	public void putHouses() {
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				if(SquaresWhithCode[i][j]==3) {
					Position position=new Position(i,j);
					House h=new House(position,Color.YELLOW);
					house.add(h);
				}
			}
		}
	}
	public void putFire() {
		for(int i=0;i<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES;i++) {
			for(int j=0;j<SimulationParameters.NUMBER_OF_WHIDTH_SQUARES;j++) {
				if(SquaresWhithCode[i][j]==2) {
					Position position=new Position(i,j);
					Fire f=new Fire(position,Color.RED);
					fire.add(f);
				}
			}
		}
	}

}
