package data;

import java.util.HashMap;

import javax.swing.text.Position;

public class Map {
	
	private HashMap<Object, Position> position;
	private String name;
	
	

	public Map(HashMap<Object, Position> position, String name) {
		this.position = position;
		this.name = name;
	}

	public HashMap<Object, Position> getPosition() {
		return position;
	}

	public void setPosition(HashMap<Object, Position> position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
