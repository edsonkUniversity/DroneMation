package data;

public class Drone {
	private String name;
	private int line;
	private int column;
	
	public Drone(String name, int line, int column) {
		super();
		this.name = name;
		this.line = line;
		this.column = column;
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
	
	public String toString() {
		 return "[line=" + line + ", column=" + column + "]";
	}
	
}