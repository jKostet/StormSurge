package stormsurge.entities;

/**
 *
 * @author jkostet
 */
public class Ship {

    private String name;
    private int length;
    private int health;
    private int frontPosX;
    private int frontPosY;
    private int backPosX;
    private int backPosY;

    public Ship(int length) {
        this.name      = "Unnamed Ship";
        
        this.length    = length;
        this.health    = length;
        
        this.frontPosX = 0;
        this.frontPosY = 0;
        this.backPosX  = 0;
        this.backPosY  = 0;
    }

    /**
     * Gives the ship a name, as
     * Ships are created with
     * default name "Unnamed Ship".
     * 
     * @param name to be given
     */
    public void setName(String name) {
        // Names the ship
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        String shipname = "Unnamed Ship";
//        
//        // Should the ship be named, use it's name instead
//        if (!this.name.isEmpty()) {
//            shipname = name;
//        }
        
        // Return Ships name, length and health
        return this.name + ", Length: " + length + ", Health: " + health;
    }

    /**
     * The toString() method
     * with the Ship's coordinates added to the end.
     * 
     * @param withCoordinates true for coordinates, false for just toString()
     * @return toString() with coordinates
     */
    public String toString(boolean withCoordinates) {
        
        // If true, returns the normal toString() along with ships front and back coordinates
        if (withCoordinates) {
            return toString() + ", Front at " + frontPosX + "," + frontPosY +
                                "; Back at " + backPosX + "," + backPosY;
        } else {
            return toString();
        }
    }

    public int getHealth() {
        return health;
    }
    
    /**
     * Sets the coordinates for the Ship's
     * frontend, then calculates coordinates
     * for the backend using the length of the ship
     * and the way the Ship is facing.
     * 
     * @param X the x coordinate
     * @param Y the y coordinate
     * @param facing N for North/Up, S for South/Down, E for East/Right, W for West/Left
     */
    public void setFrontPos(int X, int Y, char facing) {
        
        // This will set the ship's front's position accordingly
        // and the back's position calculated with
        // it's facing and length
        
        this.frontPosX = X;
        this.frontPosY = Y;
        
        // The ship is facing
        // 'N' for North / Up 
        // 'E' for East  / Right
        // 'S' for South / Down
        // 'W' for West  / Left
        
        
        // Notice that for drawing things,
        // coordinates will start from top left, not bottom left
        switch(facing) {
            case 'N':  this.backPosX = X;
                       this.backPosY = X + length -1;
                       break;
                
            case 'E':  this.backPosX = X - length +1;
                       this.backPosY = Y;
                       break;
                
            case 'S':  this.backPosX = X;
                       this.backPosY = Y - length +1;
                       break;
                
            case 'W':  this.backPosX = X + length -1;
                       this.backPosY = Y;
                       break;
        }
        
    }
    
    public String getFrontPos() {
        return frontPosX + "," + frontPosY;
    }
    
    public String getBackPos() {
        return backPosX + "," + backPosY;
    }

}
