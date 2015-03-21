/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

import java.util.Scanner;

/**
 *
 * @author jkostet
 */
public class TextBasedUserInterface {
    
    private Scanner commands;
    private boolean running;

    
    public TextBasedUserInterface() {
        commands = new Scanner(System.in);
        running = true;
    }
    
    public void run() {
        printCommands();
        while (running) {
            int command = Integer.parseInt(commands.nextLine());
            performCommand(command);
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
    
    public void performCommand(int command) {
        
        switch(command) {
            case 1 : System.out.println("This will draw the Sea");
                     break;
            case 2 : System.out.println("This will add ships");
                     break;
            case 0 : running = false;
                     break;
            default: printCommands();
                     break;
        }
    }
    
}
