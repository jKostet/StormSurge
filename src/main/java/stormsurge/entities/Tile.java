/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author jkostet
 */
public class Tile extends JButton /* JPanel  */ {
    private boolean isSelected;
    private boolean destroyed;
    private boolean hasShip;
    private boolean addingShips;
    private ActionListener actionListener;
    
    private int xCoordinate;
    private int yCoordinate;
    
//    private JPanel face;
    private JButton face;

    public Tile() {
        this.face = new JButton();
        
        this.xCoordinate = -1;
        this.yCoordinate = -1;
        
        this.isSelected = false;
        this.destroyed = false;
        this.hasShip = false;
        this.addingShips = false;
        
    }
    
    private void setActionListener() {
        this.actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //Destroy
            }
        };
    }
    
    public void setCoordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        
        setText(getCoordinates());
        setToolTipText(getCoordinates());
        
    }

    public void setAddingShips(boolean addingShips) {
        this.addingShips = addingShips;
    }
    
    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
    
    public boolean getDestroyed() {
        return destroyed;
    }

    public void setIsSelected(boolean selected) {
        this.isSelected = selected;
    }
    
    public boolean getIsSelected() {
        return isSelected;
    }

    public void setHasShip(boolean ship) {
        this.hasShip = ship;
    }
    
    public boolean getHasShip() {
        return hasShip;
    }
    
    @Override
    public String toString() {
        if (isSelected) {
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
