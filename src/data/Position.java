package data;

public class Position {
	private int ligne;
	private int column;
	
	public Position(int ligne, int column) {
		this.ligne = ligne;
		this.column = column;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
}
