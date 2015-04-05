/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stormsurge;

import stormsurge.entities.Sea;
import stormsurge.logic.GUI_MainMenu;

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
        Sea testSea = new Sea(5,5);
//        
//        TextBasedUserInterface tbui = new TextBasedUserInterface();
//        tbui.setSea(testSea);
//        tbui.run();
        
//        GUI_ButtonListener bl = new GUI_ButtonListener();
        
        GUI_MainMenu mm = new GUI_MainMenu();
        
        
//        System.out.println(testSea.drawSeaInText());
        
//        System.out.println(testSea.listShips());
    }
    
    public static void printHelloSea() {
        System.out.println("Hello Sea!");
    }
}
