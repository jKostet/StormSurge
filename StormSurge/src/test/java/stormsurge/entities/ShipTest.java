/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import stormsurge.entities.Ship;

/**
 *
 * @author jkostet
 */
public class ShipTest {

    private Ship testShip;
    
    @Before
    public void setUp() {
        testShip = new Ship(3);
    }
    
    @Test
    public void constructorSetsHealthRight() {
        assertEquals(3, testShip.getHealth());
    }
    
    @Test
    public void shipHasNoNameBeforeItIsNamed() {
        assertEquals("", testShip.getName());
    }
    
    @Test
    public void toStringReturnsUnnamedShipIfTheShipIsNotNamed() {
        assertEquals("Ship: Unnamed Ship, Length: 3, Health: 3", testShip.toString());
    }
    
    @Test
    public void setNameWorksCorrectly() {
        testShip.setName("Mighty Test Ship");
        assertEquals("Mighty Test Ship", testShip.getName());
    }
    
    @Test
    public void afterNameHasBeenSetToStringReturnsItToo() {
        testShip.setName("Mighty Test Ship");
        assertEquals("Ship: Mighty Test Ship, Length: 3, Health: 3", testShip.toString());
    }
    
    @Test
    public void toStringWithCoordinatesReturnsToStringAlongWithShipFrontAndBackPos() {
        assertEquals("Ship: Unnamed Ship, Length: 3, Health: 3, Front at 0,0; Back at 0,0", testShip.toString(true));
    }
    
    @Test
    public void toStringWithCoordinatesFalseJustReturnsToString() {
        assertEquals("Ship: Unnamed Ship, Length: 3, Health: 3", testShip.toString(false));
    }
    
    @Test
    public void setFrontPosFacingNorth() {
        testShip.setFrontPos(1, 1, 'N');
        assertEquals("1,1", testShip.getFrontPos());
        assertEquals("1,3", testShip.getBackPos());
    }
    
    @Test
    public void setFrontPosFacingWest() {
        testShip.setFrontPos(4, 1, 'W');
        assertEquals("4,1", testShip.getFrontPos());
        assertEquals("6,1", testShip.getBackPos());
    }
    
    @Test
    public void setFrontPosFacingSouth() {
        testShip.setFrontPos(4, 5, 'S');
        assertEquals("4,5", testShip.getFrontPos());
        assertEquals("4,3", testShip.getBackPos());
    }
    
    @Test
    public void setFrontPosFacingEast() {
        testShip.setFrontPos(2, 7, 'E');
        assertEquals("2,7", testShip.getFrontPos());
        assertEquals("0,7", testShip.getBackPos());
    }
    
}
