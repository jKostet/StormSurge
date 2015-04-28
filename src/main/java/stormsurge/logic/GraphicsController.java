/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
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
    private Sea sea;
    
    private JPanel tempFSPfix;
    
    // If true, render game only in text
    private boolean textOnly;

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
        this.tempFSPfix = new JPanel();
    }

    public void setSea(Sea sea) {
        this.sea = sea;
    }

    public Sea getSea() {
        return sea;
    }
    
    
    public GraphicsController(boolean textOnly) {
        this.textOnly = textOnly;
        
        this.mainMenu = new GUI_MainMenu();
//        this.buttonListener = new GUI_ButtonListener();
        
        this.fleetStats = new FleetStatusPanel();
    }

    @Override
    public void run() {
        
        
        this.mainMenu.setSize(800, 600);
//        this.mainMenu.setVisible(true);
        this.mainMenu.setLocationRelativeTo(null);
        this.mainMenu.setTitle("Storm Surge main menu");


        JFrame game2x2 = new JFrame();
        game2x2.setSize(800, 600);
        game2x2.setLocationRelativeTo(null);
        game2x2.setTitle("Storm Surge game window");

        game2x2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        game2x2.setLayout(new GridLayout(1,2));
        
        JPanel gameAndControl = new JPanel(new GridLayout(2, 1));
        game2x2.add(gameAndControl);
        
        gameAndControl.add(this.sea.getSeaPanel());
        tempFixFSP();
        game2x2.add(tempFSPfix);
        
        
//        gameAndControl.add(new JTextField("[CONTROLS HERE]"));
        JPanel topControl = new JPanel(new FlowLayout());
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2, 1));
        controls.add(new JTextField("[Controls here]"));
        controls.add(new JButton("FIRE"));
        
        topControl.add(controls);
        gameAndControl.add(topControl);
        
        game2x2.setVisible(true);
        this.mainMenu.setVisible(true);
//                BgIJF bg = new BgIJF();

    }
    
    public void setupGC() {
        buttonListener.setNewGame(this.mainMenu.getNewGameButton());
    }    
    
    
    public void tempFixFSP() {

//        tempFSPfix.setLayout(new GridLayout(2, 1));
        tempFSPfix.setLayout(new FlowLayout());
        
        JTextField fleetNameField = new JTextField();
        fleetNameField.setText(this.fleet.getName());
        fleetNameField.setEditable(false);


    //    frame0.setLayout(new GridLayout(fleet.getShips().size(), 1));
//        tempFSPfix.setLayout(new GridLayout(2, 1));
        tempFSPfix.add(fleetNameField);
//        JPanel shipsPanel = new JPanel();

        JPanel topTemppa = new JPanel(new GridLayout(fleet.getShips().size(), 1));
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
            bar.setBackground(Color.red);
            bar.setForeground(Color.green);
            bar.setValue(ship.getHealth() - ship.getDamaged());
            bar.setStringPainted(true);
    //        temppa.add(bar);

            picHPholder.add(tempPIC);
            picHPholder.add(bar);

            temppa.add(picHPholder);
            topTemppa.add(temppa);
//            shipsPanel.add(temppa);
        }
        tempFSPfix.add(topTemppa);

//        tempFSPfix.add(shipsPanel);
        tempFSPfix.setVisible(true);
    }
    
}
