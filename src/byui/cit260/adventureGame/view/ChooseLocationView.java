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
public class ChooseLocationView extends View {
    
    public ChooseLocationView() {
        super (
                 "\n"
                  + "\n---------------------------------"
                  + "\n| Choose Location"
                  + "\n---------------------------------"
                  + "\nC - Cullfield"
                  + "\nD - Dalry"
                  + "\nH - Holbeck"
                  + "\nL - Lanercoast"
                  + "\nQ - Quit to Game Menu"
                  + "\n---------------------------------");
       
    }
    
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
         switch (value) {
            case "C": // goal of the game
                this.goToCullfield();
                break;
            case "D":
                this.goToDalry();
                break;
            case "H":
                this.goToHolbeck();
                break;
            case "L":
                this.goToLanercoast();
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
        
    }

    private void goToCullfield() {
        System.out.println("\n*** goToCullfield() function called ***");
    }

    private void goToDalry() {
        System.out.println("\n*** goToDalry() function called ***");
    }

    private void goToHolbeck() {
        System.out.println("\n*** goToHolbeck() function called ***");
    }

    private void goToLanercoast() {
        System.out.println("\n*** goToLanercoast() function called ***");
    }
    
}
