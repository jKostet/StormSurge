/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stormsurge;

import stormsurge.entities.Fleet;
import stormsurge.entities.Ship;

/**
 *
 * @author Juho Kostet
 */


/** TODO:
 *  - 2d grid class "The Sea!" to place things on
 *      - Text based rendering
 *  - Ship class
 *  - 
 * 
 */
public class Main {
    
    public static void main(String [ ] args){
//        Sea testSea = new Sea(5,5);
////        
//        TextBasedUserInterface tbui = new TextBasedUserInterface();
//        tbui.setSea(testSea);
//        tbui.run();
        
//        GUI_ButtonListener bl = new GUI_ButtonListener();
//        GUI_MainMenu mm = new GUI_MainMenu();
        
        Fleet p = new Fleet("Pirates");
        Fleet f = new Fleet("French Navy");
        
        Ship q = new Ship(5);
        q.setName("Queen Anne's Revenge");
        
        p.addShipToFleet(q);
        p.addShipToFleet(new Ship(1));
        p.addShipToFleet(new Ship(2));
        p.addShipToFleet(new Ship(3));
        p.addShipToFleet(new Ship(4));

        System.out.println(p.toString());
        
        System.out.println("--------NOSTATS---------");
        
        System.out.println(p.toString(true));

    }
    
    public static void printHelloSea() {
        System.out.println("Hello Sea!");
    }
}
