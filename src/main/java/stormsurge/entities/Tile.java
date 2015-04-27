/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author jkostet
 */
public class Tile extends JButton /* JPanel  */ {
    private boolean selected;
    private boolean destroyed;
    private boolean hasShip;
    
    private int xCoordinate;
    private int yCoordinate;
    
//    private JPanel face;
    private JButton face;

    public Tile() {
//        this.face = new JPanel();
        this.face = new JButton();
//        face.setSize(8, 8);
        this.face.setText("ayy");
        
        this.xCoordinate = -1;
        this.yCoordinate = -1;
        
        this.selected = false;
        this.destroyed = false;
        this.hasShip = false;
    }
    
    public void setCoordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
    
    public boolean getDestroyed() {
        return destroyed;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    public boolean getSelected() {
        return selected;
    }

    public void setHasShip(boolean ship) {
        this.hasShip = ship;
    }
    
    public boolean getHasShip() {
        return hasShip;
    }
    
    @Override
    public String toString() {
        if (selected) {
            return "[@]";
        } else if (destroyed && hasShip) {
            return "[X]";
        } else if (destroyed && !hasShip) {
            return "[x]";
        } else {
            return "[_]";
        }
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }
    
    public String getCoordinates() {
        return "(" + xCoordinate + "," + yCoordinate + ")";
    }
}
