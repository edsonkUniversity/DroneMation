package data;

import java.awt.Color;

public class Tree extends Element {

	private boolean isLeftTree;
	private boolean isRightTree;
	private boolean isUpTree;
	private boolean isDownTree;



	public boolean isLeftTree() {
		return isLeftTree;
	}

	public void setLeftTree(boolean leftTree) {
		isLeftTree = leftTree;
	}

	public boolean isRightTree() {
		return isRightTree;
	}

	public void setRightTree(boolean rightTree) {
		isRightTree = rightTree;
	}

	public boolean isUpTree() {
		return isUpTree;
	}

	public void setUpTree(boolean upTree) {
		isUpTree = upTree;
	}

	public boolean isDownTree() {
		return isDownTree;
	}

	public void setDownTree(boolean downTree) {
		isDownTree = downTree;
	}



	public Tree(Position position) {
		super(position, Color.green);
		// TODO Auto-generated constructor stub
	}	
}
