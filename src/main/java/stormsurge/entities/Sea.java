package stormsurge.entities;

/**
 *
 * @author jkostet
 */
public class Sea {
    private int sizeX;
    private int sizeY;
    

    /**
     * Creates a new Sea of size x * y.
     * 
     * @param x width of the sea
     * @param y height of the sea
     */
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

}
