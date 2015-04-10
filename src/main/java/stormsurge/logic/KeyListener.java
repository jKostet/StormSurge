/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
 
/**
 *
 * @author jkostet
 */
public class KeyListener {
    
    public void processKeys(){
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(
        new KeyEventDispatcher()  { 
            public boolean dispatchKeyEvent(KeyEvent e){
                if(e.getID() == KeyEvent.KEY_PRESSED){
                    handleKeyPress(e.getKeyCode());
                        return false;
                    }
                else {
                    return true;
                }
                }
            });}
    
    
    private void handleKeyPress(int keyCode) {

    switch (keyCode) {
            
    // Left key
    case 37  :  //do
                System.out.println("LEFT");
                break;
        
    // Up key
    case 38  :  //do
                System.out.println("UP");
                break;
        
    // Right key
    case 39  :  //do
                System.out.println("RIGHT");
                break;
        
    // Down key
    case 40  :  //do
                System.out.println("DOWN");
                break;
    }
}
}
