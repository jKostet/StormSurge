
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

//        System.out.println(p.toString());
//        
//        System.out.println("--------NOSTATS---------");
//        
//        System.out.println(p.toString(true));
        FleetStatusPanel FSP = new FleetStatusPanel();
        FSP.setFleet(french);
        
        JFrame testframe = new JFrame();
        testframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        testframe.setLayout(new FlowLayout());
        
        testframe.add(FSP);
        
        // set testframe size px,px
        testframe.setSize(new Dimension(350,400));
        // set testframe to appear in middle of screen
        testframe.setLocationRelativeTo(null);
        
        
        testframe.setVisible(true);
        FSP.setVisible(true);
        
    }
    
    public static void printHelloSea() {
        System.out.println("Hello Sea!");
    }
}
