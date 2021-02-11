package data;

public class Drone extends Element {
	
	private int[][] vision;
	
	public Drone(Position position) {
		super(position);
		this.vision= new int[10][10];
	}

	public int[][] getVision() {
		return vision;
	}

	public void setVision(int[][] vision) {
		this.vision = vision;
	}

}