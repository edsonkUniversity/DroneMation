package gui;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


import data.Map;
import process.ElementManager;

public class GuiMap extends JPanel {
    
    private BufferedImage image;
    
    private Map map;
    private ElementManager manager;
    
    
    public GuiMap(Map map, ElementManager manager) {
        this.map=map;
        this.manager=manager;
        try {
            image = ImageIO.read(map.getPositions()[0][0].getImg());
          } catch (Exception e) {
            e.printStackTrace();
          }
        

    }
    

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Coordonnées à compléter
        g.drawImage(image, 0, 0, this);
    }
}