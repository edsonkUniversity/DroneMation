package data;

public class Drone extends Element {
	
	private Zone[][] vision;
	
	public Drone(Position position) {
		super(position);
		this.vision= new Zone[10][10];
	}

	public Zone[][] getVision() {
		return vision;
	}

	public void setVision(Zone[][] vision) {
		this.vision = vision;
	}

}