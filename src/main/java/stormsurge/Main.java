
package stormsurge;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import stormsurge.entities.*;
import stormsurge.logic.*;

/**
 *
 * @author Juho Kostet
 */


/** TODO:
 *  - 2d grid class "The Sea!" to place things on
 *      - Text based rendering
 *  - Ship class
 */

public class Main {
    
    public static void main(String [ ] args){
        
        Fleet p = new Fleet("Pirates");
        Fleet french = new Fleet("French Navy");
        
        Ship q = new Ship(5);
        q.setName("Queen Anne's Revenge");
        
        p.addShipToFleet(q);
        p.addShipToFleet(new Ship(1));
        p.addShipToFleet(new Ship(2));
        p.addShipToFleet(new Ship(3));
        p.addShipToFleet(new Ship(4));
        p.addShipToFleet(new Ship(5));
        p.addShipToFleet(new Ship(6));
        p.addShipToFleet(new Ship(7));


        Ship u = new Ship(3);
        u.setName("Damaged test");
        u.damageShip(7);
        
        p.addShipToFleet(u);
        
//        System.out.println(p.toString());
//        
//        System.out.println("--------NOSTATS---------");
//        
//        System.out.println(p.toString(true));
        
//        FleetStatusPanel FSP = new FleetStatusPanel();
//        FSP.setFleet(p);
//        FSP.listFleet();
//        FSP.setVisible(true);
        
        Tile ttt = new Tile();
        System.out.println(ttt);
        System.out.println(ttt.getCoordinates());
        
//        GraphicsController GC = new GraphicsController(false);
////        GC.setupGC();
////        GC.fleetStats.setFleet(p);
//        GC.setFleet(p);
//        GC.run();
    }
    
    public static void printHelloSea() {
        System.out.println("Hello Sea!");
    }
}
