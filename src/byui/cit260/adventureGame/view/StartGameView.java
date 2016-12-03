/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.control.GameControl;
import byui.cit260.adventureGame.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author vladbalashov
 */
public class StartGameView {
    
    private String promptMessage;
    protected final BufferedReader keyboard = AdventureGame.getInFile();
    protected final PrintWriter console = AdventureGame.getOutFile();
    
    public StartGameView(){
        
        this.promptMessage = "\nHelp us, you have to, please… wait, you aren't Trombone.  What's your name?";
        //display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println(
                "\n********************************************"
              + "\n*                                          *"
              + "\n* In the ancient time people lived to      *"
              + "\n* fight. Those who were weak needed        *"
              + "\n* their hero to fight for them. In the     *"
              + "\n* Adventure Game you will be provided with *"
              + "\n* opportunity to become a hero and fight   *"
              + "\n* enemies. On the way you will be able to  *"
              + "\n* find the most treasured of objects, love!*"
              + "\n*                                          *"
              + "\n* Good luck in your adventure of becoming  *"
              + "\n* true hero!                               *"
              + "\n*                                          *"
              + "\n********************************************"
  
        );
    }

    public void displayStartGameView() {
       
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit 
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initialized to not valid
        try{
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length()<1) { // value is blank
                System.out.println("\nIt can not be blank! Stop trying to break the game,"
                        + " just tell me your name. "
                        + "We need to know our hero's name.");
                continue;     
            }
            
            break; // end the loop
        }
        }catch (Exception e){
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        if (playersName.length() <2 ) {
            System.out.println("\nInvalid players name:"
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessfull
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        return true; // success
    }

    private void displayNextView(Player player) {
        System.out.println("\n=========================================="
                         + "\n Welcome to Adventure Game " + player.getName()
                         + "\n We hope you have a lot of fun and find"
                         + "\n the most precios gift"
                         + "\n==========================================");
        
        // create main menu object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }
    
}
