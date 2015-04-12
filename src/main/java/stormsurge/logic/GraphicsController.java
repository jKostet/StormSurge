/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

/**
 *
 * @author jkostet
 */
public class GraphicsController {
    /**
     *  Class will control rendering the game
     *  in graphical representation
     *  and text only
     */
    
    private GUI_MainMenu mainMenu;
    private GUI_ButtonListener buttonListener;
    
    // If true, render game only in text
    private boolean textOnly;

    public GraphicsController(boolean textOnly) {
        this.textOnly = textOnly;
        
        this.mainMenu = new GUI_MainMenu();
        this.buttonListener = new GUI_ButtonListener();
    }
    
    
    
    
}
