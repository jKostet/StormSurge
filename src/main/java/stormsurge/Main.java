/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stormsurge;

import stormsurge.entities.Sea;
import stormsurge.logic.TextBasedUserInterface;

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
//        System.out.println("Hello Sea!");
//        printHelloSea();
//        System.out.println("");
//        
//        
//        Sea s = new Sea(4,5);
//        System.out.println(s + "\n");
//
//        
//        Ship boat = new Ship(4);
//        System.out.println(boat + "\n");
//
//        
//        boat.setName("USS Tester");
//        System.out.println(boat);
//        System.out.println(boat.toString(true) + "\n");
//        
//        
//        System.out.println("--------------------------------- \n");
//        
//        Ship a = new Ship(2);
//        Ship b = new Ship(3);
//        Ship c = new Ship(3);
//
//        
//        boat.setFrontPos(1, 1, 'N');
//        System.out.println(boat.toString(true));
//        
//        a.setFrontPos(4, 1, 'W');
//        System.out.println(a.toString(true));
//        
//        b.setFrontPos(4, 5, 'S');
//        System.out.println(b.toString(true));
//        
//        c.setFrontPos(2, 7, 'E');
//        System.out.println(c.toString(true));
//        
//        System.out.println("\n --------------------------------- \n");
//        
//        s.drawSeaInText();
//        System.out.println("");
        
        Sea testSea = new Sea(5,5);
        
//        TextBasedUserInterface tbui = new TextBasedUserInterface();
//        tbui.setSea(testSea);
//        tbui.run();
        
        System.out.println(testSea.drawSeaInText());
        
//        System.out.println(testSea.listShips());
    }
    
    public static void printHelloSea() {
        System.out.println("Hello Sea!");
    }
}
