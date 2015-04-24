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
public class TileTest {
    
    private Tile testTile;
    
    @Before
    public void setUp() {
        testTile = new Tile();
    }
    
    @Test
    public void newTileShouldHaveCoordinatesMinusOneMinusOne() {
        assertEquals("(-1,-1)", testTile.getCoordinates());
    }
    
    @Test
    public void settingTileCoordinatesWorks() {
        testTile.setCoordinates(3, 9);
        assertEquals("(3,9)", testTile.getCoordinates());
    }

}
