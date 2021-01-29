package data;

public class Zone {
	private int column;
	private int line;
	
	public Zone(int column,int line) {
		this.column=column;
		this.line=line;	
	}
	
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	
}
