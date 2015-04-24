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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *   Example code from JPF
 */


public class GUI_ButtonListener {
 
    private JButton newGame;
    
    public GUI_ButtonListener() {
        
    }
    
    public void setNewGame(JButton nG) {
        this.newGame = nG;
    }
    
    public void createAndShowGUI()  {
 
        //Add action listener to button
        newGame.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");
            }
        });      
 
    }
}