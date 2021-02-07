package data;

import java.awt.Color;
import java.util.ArrayList;

public abstract class Element  {
		private Position position;
		private Color color;
		
		
		public Element(Position position, Color color) {
			this.position=position;
			this.color = color;
		}
		
		public Element(Position position) {
			this.position=position;
			this.color = Color.CYAN;
		}
		
		public Position getPosition() {
			return position;
		}

		public void setPosition(Position position) {
			this.position = position;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
}
