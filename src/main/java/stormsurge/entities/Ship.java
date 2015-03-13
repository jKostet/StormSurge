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
public class Ship {
    private int length;
    private int health;

    public Ship(int length) {
        this.length = length;
        this.health = length;
    }
    
    @Override
    public String toString() {
        return "ship";
    }

    public int getHealth() {
        return health;
    }
    
    
    
}
