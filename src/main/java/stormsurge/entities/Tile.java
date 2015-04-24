/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import javax.swing.JPanel;

/**
 *
 * @author jkostet
 */
public class Tile extends JPanel {
    private boolean selected;
    private boolean destroyed;
    private boolean ship;
    
    private int[][] coords;
    
    private JPanel face;

    public Tile() {
        this.face = new JPanel();
        
        this.selected = false;
        this.destroyed = false;
        this.ship = false;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setShip(boolean ship) {
        this.ship = ship;
    }
    
    @Override
    public String toString() {
        if (selected) {
            return "[@]";
        } else if (destroyed && ship) {
            return "[X]";
        } else if (destroyed && !ship) {
            return "[x]";
        } else {
            return "[_]";
        }
    }
    
    
}
