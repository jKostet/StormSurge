/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import stormsurge.entities.Fleet;
import stormsurge.entities.Sea;
import stormsurge.entities.Ship;

/**
 *
 * @author jkostet
 */
public class GraphicsController implements Runnable {
    /**
     *  Class will control rendering the game
     *  in graphical representation
     *  and text only
     */
    
    private GUI_MainMenu mainMenu;
    private GUI_ButtonListener buttonListener;
    
    private FleetStatusPanel fleetStats;
    private Fleet fleet;
    
    private JPanel tempFSPfix;
    
    // If true, render game only in text
    private boolean textOnly;

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
        this.tempFSPfix = new JPanel();
    }
    
    public GraphicsController(boolean textOnly) {
        this.textOnly = textOnly;
        
        this.mainMenu = new GUI_MainMenu();
//        this.buttonListener = new GUI_ButtonListener();
        
        this.fleetStats = new FleetStatusPanel();
    }

    @Override
    public void run() {
        
//        setupGC();
        this.mainMenu.setSize(800, 600);
        this.mainMenu.setVisible(true);
        JFrame game2x2 = new JFrame();
        game2x2.setSize(800, 600);
        game2x2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        game2x2.setLayout(new GridLayout(1,2));
        
        JPanel gameAndControl = new JPanel(new GridLayout(2, 1));
        game2x2.add(gameAndControl);
        
        gameAndControl.add(new JTextArea(new Sea(10,10).drawSeaInText(), 10,10));
        tempFixFSP();
        game2x2.add(tempFSPfix);
//        fleetStats.listFleet();
//        game2x2.add(fleetStats);
        gameAndControl.add(new JTextField("[CONTROLS HERE]"));
        
        game2x2.setVisible(true);
        
    }
    
    public void setupGC() {
        buttonListener.setNewGame(this.mainMenu.getNewGameButton());
    }    
    
    
    public void tempFixFSP() {

        JTextField fleetNameField = new JTextField();
        fleetNameField.setText(this.fleet.getName());
        fleetNameField.setEditable(false);


    //    frame0.setLayout(new GridLayout(fleet.getShips().size(), 1));
//        tempFSPfix.setLayout(new GridLayout(2, 1));
        tempFSPfix.add(fleetNameField);
//        JPanel shipsPanel = new JPanel();


        for (Ship ship : fleet.getShips()) {
            // Create new JPanel with the ships name, picture and health bar
            JPanel temppa = new JPanel();
            temppa.setLayout(new GridLayout(1,2));

            JTextField temp = new JTextField();
            temp.setText(ship.getName());
    //        frame0.add(temp);
            temppa.add(temp);

            JPanel picHPholder = new JPanel(new GridLayout(2, 1));
            JTextField tempPIC = new JTextField("[picture of the ship]");


            JProgressBar bar = new JProgressBar(0, ship.getHealth());
            bar.setValue(ship.getHealth() - ship.getDamaged());
            bar.setStringPainted(true);
    //        temppa.add(bar);

            picHPholder.add(tempPIC);
            picHPholder.add(bar);

            temppa.add(picHPholder);

//            shipsPanel.add(temppa);
            tempFSPfix.add(temppa);
        }
//        tempFSPfix.add(shipsPanel);
        tempFSPfix.setVisible(true);

    }
    
}
