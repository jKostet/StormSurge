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
public class Sea {
    
    private ArrayList<Ship> Ships;
    private int sizeX;
    private int sizeY;
//    private 
    

    public Sea(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
        this.Ships = new ArrayList<>();
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

    public ArrayList getShips() {
        return Ships;
    }
    
    public void addShip(Ship ship) {
        this.Ships.add(ship);
    }
    
    public void drawSea() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                System.out.print("[ ]");
            }
            System.out.println();
        }
    }
}
