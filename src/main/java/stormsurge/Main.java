
package stormsurge;

import javax.swing.JFrame;
import stormsurge.entities.*;

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
        
        Fleet p = new Fleet("Pirate fleet of YARRR");
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
        
//        Tile ttt = new Tile();
//        System.out.println(ttt);
//        System.out.println(ttt.getCoordinates());
//        
//        GraphicsController GC = new GraphicsController(false);
//        GC.setSea(new Sea(10,10));
//        GC.setupGC();
//        GC.fleetStats.setFleet(p);
//        GC.setFleet(p);
//        GC.run();
        
        Sea yee = new Sea(10 , 10);
        JFrame frank = new JFrame();
        frank.setLocationRelativeTo(null);
        frank.add(yee.getSeaPanel());
        frank.setVisible(true);
        frank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frank.setSize(400, 400);
        
        int i = 1;
        for (Tile tile  : yee.getTiles()) {
            System.out.print(tile.getCoordinates());
            System.out.print(" ");
            if ( i == 10 ) {
                System.out.println("");
                i = 0;
            }
            i++;
        }
        
        System.out.println("");
        
        
        
        
//        Sea s = new Sea(8,8);
//        JFrame frame = new JFrame();
//        JPanel pp = s.getSeaPanel();
//        pp.setVisible(true);
//
//        frame.add(pp);
//        frame.setVisible(true);
//        frame.setSize(400, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public static void printHelloSea() {
        System.out.println("Hello Sea!");
    }
}
