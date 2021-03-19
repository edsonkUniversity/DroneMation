package process;

import config.SimulationParameters;
import data.Element;
import data.Tree;

import java.awt.*;

public  class Detection {

    private Element[][] area;

    public Detection(Element[][] area) {
        this.area = area;
    }

    public void detecter(){
        for (int indexLine = 0; indexLine < SimulationParameters.NUMBER_OF_HEIGHT_SQUARES; indexLine++) {
            for (int indexColumn = 0; indexColumn < SimulationParameters.NUMBER_OF_WIDTH_SQUARES; indexColumn++) {
                if (!area[indexLine][indexColumn].isVisit()){
                    if (area[indexLine][indexColumn].getColor().equals(Color.GREEN)) {
                        dealTree((Tree)area[indexLine][indexColumn],indexLine,indexColumn);
                    }else {
                        area[indexLine][indexColumn].setVisit();
                    }
                }
            }
        }
    }

    private void dealTree(Tree tree, int localLine, int localColumn) {
        tree.setVisit();
        if (!area[localLine+1][localColumn].isVisit()){
            if (area[localLine][localColumn].getColor().equals(Color.GREEN)) {
                tree.setUpTree(true);
                dealTree((Tree)area[localLine][localColumn],localLine,localColumn);
            }else {
                area[localLine+1][localColumn].setVisit();
            }
        }
        if (!area[localLine-1][localColumn].isVisit()){
            if (area[localLine][localColumn].getColor().equals(Color.GREEN)) {
                tree.setDownTree(true);
                dealTree((Tree)area[localLine][localColumn],localLine,localColumn);
            }else {
                area[localLine-1][localColumn].setVisit();
            }
        }
        if (!area[localLine][localColumn+1].isVisit()){
            if (area[localLine][localColumn].getColor().equals(Color.GREEN)) {
                tree.setRightTree(true);
                dealTree((Tree)area[localLine][localColumn],localLine,localColumn);
            }else {
                area[localLine][localColumn+1].setVisit();
            }
        }
        if (!area[localLine][localColumn-1].isVisit()){
            if (area[localLine][localColumn].getColor().equals(Color.GREEN)) {
                tree.setLeftTree(true);
                dealTree((Tree)area[localLine][localColumn],localLine,localColumn);
            }else {
                area[localLine][localColumn-1].setVisit();
            }
        }
        tree.setContour(!(tree.isDownTree()&&tree.isRightTree()&&tree.isUpTree()&&tree.isLeftTree()));
    }



}
