package gui;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import data.Map;
import process.ElementManager;

public class GuiMap extends JPanel {
    
    private BufferedImage image;
    
    private Map map;
    private ElementManager manager;
    
    
    public GuiMap(Map map, ElementManager manager) {
        this.map=map;
        this.manager=manager;

    }
    

    
    public void paintMap(Graphics g) {
        paintComponent(g);
        //Coordonnées à compléter
        g.drawImage(image, 0, 0, this);
    }
}