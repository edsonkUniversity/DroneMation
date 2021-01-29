package data;

public class Drone {
	private String name;
	private int line;
	private int column;
	private Zone[][] vision;
	
	public Drone(String name, int line, int column, Zone[][] visionOfStart) {
		super();
		this.name = name;
		this.line = line;
		this.column = column;
		this.vision=visionOfStart;
	}

	public Drone(String name) {
		this.name=name;
	}
	
	public void setPosition(int line, int column) {
		this.line = line;
		this.column = column;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Zone[][] getVision() {
		return vision;
	}

	public void setVision(Zone[][] vision) {
		this.vision = vision;
	}
	
	
	
	public String toString() {
		 return "[line=" + line + ", column=" + column + "]";
	}
	
}