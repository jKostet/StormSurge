/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import java.util.ArrayList;
import stormsurge.logic.ShipList;

/**
 *
 * @author jkostet
 */
public class Sea {
    
//    private ArrayList<Ship> Ships;
    private ShipList shipList;
    
    private int sizeX;
    private int sizeY;
    

    public Sea(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
//        this.Ships = new ArrayList<>();
        this.shipList = new ShipList();
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    @Override
    public String toString() {
        return "X:" + sizeX + " * Y:" + sizeY + " = " + (sizeX * sizeY) + " tiles";
    }

    //THIS SHOULD RETURN LIST OF SHIPS
//    public ArrayList getShips() {
////        return Ships;
//        return shipList;
//    }
    
    // Adds ship to the ShipList's list of ships
    public void addShip(Ship ship) {
//        this.Ships.add(ship);
        this.shipList.getShips().add(ship);
    }
    
    public void drawSea() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }
    }

    public boolean listShips() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
