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
 
    public GUI_ButtonListener() {
        
    }
    
    private static void createAndShowGUI()  {
 
        JFrame frame1 = new JFrame("JAVA");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JButton button = new JButton(" >> JavaProgrammingForums.com <<");
        //Add action listener to button
        button.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");
            }
        });      
 
        frame1.getContentPane().add(button);
        frame1.pack();
        frame1.setVisible(true);
    }
 
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}