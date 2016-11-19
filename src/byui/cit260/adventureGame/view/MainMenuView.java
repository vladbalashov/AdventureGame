/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author vladbalashov
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super(
                    "\n"
                  + "\n---------------------------------"
                  + "\n| Main Menu"
                  + "\n---------------------------------"
                  + "\nN - Start New Game"
                  + "\nL - Load Game"
                  + "\nH - Help"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n---------------------------------");

    }
    

    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L":
                this.loadGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(AdventureGame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        System.out.println("\n*** LoadGame function called ***");
    }

    private void displayHelpMenu() {
        // create main menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the main menu view
        helpMenuView.display();
    }

    private void saveGame() {
        System.out.println("\n*** SaveGame function called");
    }
    
}
