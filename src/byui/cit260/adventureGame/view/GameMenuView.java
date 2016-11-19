/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import java.util.Scanner;



/**
 *
 * @author vladbalashov
 */
public class GameMenuView extends View {
    
    
    public GameMenuView(){
        
        super ( 
                "\n"
                  + "\n---------------------------------"
                  + "\n| Game Menu"
                  + "\n---------------------------------"
                  + "\nC - Choose character"
                  + "\nL - Choose location"
                  + "\nA - Calculate ability to win"
                  + "\nQ - Quit to Main Menu"
                  + "\n---------------------------------");
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "C": // create and start a new game
                this.chooseCharacter();
                break;
            case "L":
                this.chooseLocation();
                break;

            case "A":
                this.displayCalcAbilityToWinView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void chooseCharacter() {
         System.out.println("\n*** chooseCharacter() function called ***");
    }

    private void chooseLocation() {
        ChooseLocationView chooseLocationView = new ChooseLocationView();
        
        chooseLocationView.display();
    }


    private void displayCalcAbilityToWinView() {
        CalcAbilityToWinView calcAbilityToWinView = new CalcAbilityToWinView();
                
        // Display the main menu view
        calcAbilityToWinView.displayCalcAbilityToWinView();
    }
    
 
}
