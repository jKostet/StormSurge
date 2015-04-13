/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import java.util.ArrayList;

/**
 *
 * @author jkostet
 */
public class Fleet {
    private ArrayList<Ship> ships;
    private String name;

    public Fleet(String name) {
        this.ships = new ArrayList();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }
    
    public void addShipToFleet(Ship ship) {
        this.ships.add(ship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        
        sb.append(name).append(":\n");
        for (Ship ship : ships) {
            // Adding + 1 to index, so listing starts from 1, not 0.
            sb.append(ships.indexOf(ship) + 1).append(". ");
            sb.append(ship).append("\n");
        }
        
        return sb.toString();
    }
    
    public String toString(boolean noStats) {
        if (!noStats) {
            return toString();
        } else {
            StringBuilder sb = new StringBuilder("");

            sb.append(name).append(":\n");
            for (Ship ship : ships) {
                // Adding + 1 to index, so listing starts from 1, not 0.
                sb.append(ships.indexOf(ship)).append(". ");
                sb.append(ship.getName()).append("\n");
            }

            return sb.toString();
        }
    }
}
