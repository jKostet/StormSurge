
package stormsurge.logic;

import java.util.Scanner;
import stormsurge.entities.Sea;
import stormsurge.entities.Ship;

/**
 *
 * @author jkostet
 */


/**     TODO
 *      - Perhaps implement interface using Java 8 command pattern
 */


public class TextBasedUserInterface {
    
    private Scanner commands;
    private boolean running;
    private Sea sea;
    
    //test
    private KeyListener kl;

    
    public TextBasedUserInterface() {
        commands = new Scanner(System.in);
        running = true;
        
        this.kl = new KeyListener();
    }
    
    public void run() {
        boolean update = false;
        
        
        // If true, will draw the sea after each command
        System.out.println("Constantly draw the sea? y/n");
        String draw = commands.nextLine();
        if (draw == "y") {
            update = true;
        }
        
        this.kl.processKeys();
        
        printCommands();
        
        while (running) {
            String command = commands.nextLine();
            executeCommand(command);
            
            if (update) {
                this.sea.drawSeaInText();
                System.out.println("debug");
            }
        }
    }
    
    public void wadap() {
        // Special easter egg method by EAlas7alo
        System.out.println("wadap");
    }
    
    public void printCommands() {
        System.out.println("1: Draw the sea\n"
                        +  "2: Add ship\n"
                        +  "3: Print these\n"
                        +  "0: Stop program\n");
    }
    
    public void executeCommand(String command) {
        
        switch(command) {
                    
                        // Draw the Sea
            case "1" :  System.out.println(this.sea.drawSeaInText());
                        break;
                
                        // Add ships to the Sea
            case "2" :  addShipToSea();
                        break;
                
                        // Print the list of commands (wow useful)
            case "3" :  printCommands();
                        break;
                
                        // Stop the program
            case "0" :  running = false;
                        break;
                
                        // Unknown command requests will print the list of valid commands
            default:    printCommands();
                        break;
        }
    }

    public void setSea(Sea sea) {
        this.sea = sea;
    }
    
    public void addShipToSea() {
        System.out.println("Ship length:");
        int shipLength = Integer.parseInt(commands.nextLine());
        Ship ship = new Ship(shipLength);
        this.sea.addShip(ship);
        System.out.println(ship + " added to the Sea.");
    }

}
