/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

import java.util.ArrayList;
import stormsurge.entities.Ship;

/**
 *
 * @author jkostet
 */
public class ShipList {
    private ArrayList<Ship> ships;
    
    public ShipList() {
        this.ships = new ArrayList<>();
    }

    public ArrayList getShips() {
        return ships;
    }
    
    
}
