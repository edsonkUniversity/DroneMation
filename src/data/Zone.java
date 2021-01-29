package data;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class Zone {
	private int column;
	private int line;
	private File img;
	
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
	
	public void setPosition(int line, int column) {
		this.line = line;
		this.column = column;
	}
	public void setImg(File file) {
		this.img=file;
	}

	public File getImg() {
		return img;
	}
	
}
