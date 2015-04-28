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
    
    private boolean textOnly;
    
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
        
        this.textOnly = false;
        
        setActionListener();
    }
    
    private void setActionListener() {
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setDestroyed(true);
                updateTextAndTooltip();
                
//                System.out.println("memes @" + getCoordinates() + destroyed);
                if (hasShip) {
                    System.out.println("Hit at " + getCoordinates());
                } else {
                    System.out.println("Miss at " + getCoordinates());
                } 
            };
        });
    }
    
    
    
    public void setCoordinates(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        
        updateTextAndTooltip();
    }
    
    private void updateTextAndTooltip() {
        //        setText(getCoordinates());
        setText(toString());
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
//        if (textOnly) {
//            return "[" + toString() + "]";
//        } else {
            if (isSelected) {
                return "@";
            } else if (destroyed && hasShip) {
                return "X";
            } else if (destroyed && !hasShip) {
                return "x";
            } else {
                return "_";
            }
//        }
    }

    public void setTextOnly(boolean textOnly) {
        this.textOnly = textOnly;
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
