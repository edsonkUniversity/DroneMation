package process;

import config.SimulationParameters;
import data.Element;
import data.Map;
import data.Tree;

import java.awt.*;

public  class Detection {
    private Map map;
    private Element[][] area;

    public Detection(Map map) {
        this.map = map;
        area = map.getVisionDrone();
    }

    public void detecter(){
       for (int indexLine = 0; indexLine < SimulationParameters.NUMBER_OF_HEIGHT_SQUARES; indexLine++) {
            for (int indexColumn = 0; indexColumn < SimulationParameters.NUMBER_OF_WIDTH_SQUARES; indexColumn++) {
                if (area[indexLine][indexColumn]!=null){
                    if (!area[indexLine][indexColumn].isVisit()){
                        if (area[indexLine][indexColumn].getColor().equals(Color.GREEN)) {

                            dealTree((Tree)area[indexLine][indexColumn],indexLine,indexColumn);
                        }else {
                            //area[indexLine][indexColumn].setVisit();
                        }
                    }
                }
            }
        }
    }

    private void dealTree(Tree tree, int localLine, int localColumn) {
        tree.setVisit();
        //if (localColumn==0)

        if (localLine<SimulationParameters.NUMBER_OF_HEIGHT_SQUARES-1){
            if (area[localLine+1][localColumn]==null){
                tree.setUpTree(false);
            }
            else if(!area[localLine+1][localColumn].isVisit()){
                if (area[localLine+1][localColumn].getColor().equals(Color.GREEN)) {

                    dealTree((Tree)area[localLine+1][localColumn],localLine+1,localColumn);
                }else {
                    tree.setUpTree(false);
                    area[localLine+1][localColumn].setVisit();
                }
            }
        }
        if (localLine>1){
            if (area[localLine-1][localColumn]==null) {
                tree.setDownTree(false);
            }
            else if(!area[localLine-1][localColumn].isVisit()){
                if (area[localLine-1][localColumn].getColor().equals(Color.GREEN)) {

                    dealTree((Tree)area[localLine-1][localColumn],localLine-1,localColumn);
                }else {
                    tree.setDownTree(false);
                    area[localLine-1][localColumn].setVisit();
                }
            }
        }
        if (localColumn<SimulationParameters.NUMBER_OF_WIDTH_SQUARES-1){
            if (area[localLine][localColumn+1]==null){
                tree.setRightTree(false);
            }
            else if(!area[localLine][localColumn+1].isVisit()){
                if (area[localLine][localColumn+1].getColor().equals(Color.GREEN)) {

                    dealTree((Tree)area[localLine][localColumn+1],localLine,localColumn+1);
                }else {
                    tree.setRightTree(false);
                    area[localLine][localColumn+1].setVisit();
                }
            }
        }
        if (localColumn>1){
            if (area[localLine][localColumn-1]==null){
                tree.setLeftTree(false);
            }
            else if(!area[localLine][localColumn-1].isVisit()){
                if (area[localLine][localColumn-1].getColor().equals(Color.GREEN)) {

                    dealTree((Tree)area[localLine][localColumn-1],localLine,localColumn-1);
                }else {
                    tree.setLeftTree(false);
                    area[localLine][localColumn-1].setVisit();
                }
            }
        }
        System.out.println(tree.toString()+tree.isLeftTree()+tree.isUpTree()+tree.isRightTree()+tree.isDownTree());
        tree.setContour(!(tree.isDownTree()&&tree.isRightTree()&&tree.isUpTree()&&tree.isLeftTree()));
    }



}
