package stormsurge.entities;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author jkostet
 */
public class Sea {
    private int sizeX;
    private int sizeY;
    
    private ArrayList<Tile> tiles;
    
    private JPanel seaPanel;
    
    /**
     * Creates a new Sea of size x * y.
     * 
     * @param x width of the sea
     * @param y height of the sea
     */
    public Sea(int x, int y) {
        this.sizeX = x;
        this.sizeY = y;
        
        this.tiles = new ArrayList();
        
        this.seaPanel = new JPanel(new GridLayout(x, y));
        fillSeaPanelWithTiles();
    }
    
    private void generateTiles(int x, int y) {
        
        int xCoord = 0;
        int yCoord = 0;
        
        
        for ( int tilesHigh = 0; tilesHigh < y; tilesHigh++ ) {
            for ( int tilesWide = 0; tilesWide < x; tilesWide++ ) {
                Tile tile = new Tile();
                tile.setCoordinates(tilesWide, tilesHigh);
                
                this.tiles.add(tile);
            }
        }
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    /**
     * Returns the size of the Sea.
     * Drawing the Sea is done via
     * method drawSeaInText().
     * 
     * @return string
     */
    @Override
    public String toString() {
        return "X:" + sizeX + " * Y:" + sizeY + " = " + (sizeX * sizeY) + " tiles";
    }

    /**
     * Using StringBuilder, draws the Sea in String format
     * tile (sum of coordinates) by tile.
     * 
     * @return completed String representation of the Sea
     */
    public String drawSeaInText() {
        StringBuilder sb = new StringBuilder();
        
        for (int y = 0; y < sizeY; y++) {
            
            for (int x = 0; x < sizeX; x++) {
                sb.append("[ ]");
            }
            
            sb.append("\n");
        }
        
        return sb.toString();
    }

    public JPanel getSeaPanel() {
        return seaPanel;
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }

    private void fillSeaPanelWithTiles() {
        generateTiles(sizeX, sizeX);
        
        for (Tile tile : tiles) {
            seaPanel.add(tile);
        }
    }
}
