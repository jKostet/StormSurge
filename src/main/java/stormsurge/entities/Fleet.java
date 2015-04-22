package stormsurge.entities;

import java.util.ArrayList;

/**
 *
 * @author jkostet
 */


/**
 * Contains multiple Ship class objects
 * like a real fleet consists of multiple ships
 * 
 * 
 */

public class Fleet {
    private ArrayList<Ship> ships;
    private String name;

    public Fleet(String name) {
        this.ships = new ArrayList();
        this.name = name;
    }

    /**
     * Names the fleet accordingly
     * 
     * @param name The name you would like to give to the fleet
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the Fleet
     * 
     * @return the name of the Fleet
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the list of ships in this Fleet.
     * 
     * @return the list of ships
     */
    public ArrayList<Ship> getShips() {
        return ships;
    }
    
    /**
     * Adds chosen ship to this Fleet.
     * Ship is added to an ArrayList of Ships
     * 
     * @param ship the Ship that one would like to add
     */
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
