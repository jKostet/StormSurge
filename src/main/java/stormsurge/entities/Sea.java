/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

/**
 *
 * @author jkostet
 */
public class Sea {
    
    private int sizeX;
    private int sizeY;
//    private 
    

    public Sea(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
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
    
    
    
}
