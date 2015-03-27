/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import stormsurge.entities.Sea;

/**
 *
 * @author jkostet
 */
public class SeaTest {
    
    Sea testSea;
    
    @Before
    public void setUp() {
        testSea = new Sea(6,5);
    }
    
    @Test
    public void constructorSetsSeaWidthCorrect() {
        assertEquals(6, testSea.getSizeX());
    }
    
    @Test
    public void constructorSetsSeaHeightCorrect() {
        assertEquals(5, testSea.getSizeY());
    }
    
    @Test
    public void toStringCorrectlyReturnsSeaDimensionsAndTotalTiles() {
        assertEquals("X:6 * Y:5 = 30 tiles", testSea.toString());
    }
    
    @Test
    public void drawSeaInTextMethodCorrectlyDrawsAnEmptySea() {
        assertEquals("[ ][ ][ ][ ][ ][ ]\n" +
                     "[ ][ ][ ][ ][ ][ ]\n" +
                     "[ ][ ][ ][ ][ ][ ]\n" +
                     "[ ][ ][ ][ ][ ][ ]\n" +
                     "[ ][ ][ ][ ][ ][ ]\n",
                     testSea.drawSeaInText());
    }
            
}
