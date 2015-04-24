/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jkostet
 */
public class FleetTest {
    
    private Fleet testFleet;
    
    @Before
    public void setUp() {
        testFleet = new Fleet("Testers");
        Ship test1 = new Ship(1);
        Ship test2 = new Ship(2);
        Ship test3 = new Ship(3);

        testFleet.addShipToFleet(test1);
        testFleet.addShipToFleet(test2);
        testFleet.addShipToFleet(test3);
    }
    
    @Test
    public void toStringWorks() {
        //TODO
    }
    
    @Test
    public void toStringNoStatsWorks() {
        //TODO
    }
}
