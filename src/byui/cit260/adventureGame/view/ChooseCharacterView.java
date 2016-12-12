/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

/**
 *
 * @author vladbalashov
 */
public class ChooseCharacterView extends View {
    
   public ChooseCharacterView() {
   super(
                 "\n"
                  + "\n---------------------------------"
                  + "\n| Choose Character"
                  + "\n---------------------------------"
                  + "\nD - DoveShadow"
                  + "\nA - AllysonLocks"
                  + "\nG - Gimkink"
                  + "|nF - Fizink"
                  + "\nQ - Quit to Main Menu"
                  + "\n---------------------------------");
   }
   
   @Override
   public boolean doAction(String value) {
       
       value = value.toUpperCase();
        
        switch (value) {
            
            case "D":
                this.playDoveShadow();
                break;
            case "A":
                this.playAllysonLocks();
                break;
            case "G":
                this.playGimkink();
                break;
            case "F":
                this.playFizink();
                break;    
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
    return false;
   }

    private void playDoveShadow() {
        PlayDoveShadowView playDoveShadowView = new PlayDoveShadowView();
                
        // Display the main menu view
       playDoveShadowView.display();
    }

    private void playAllysonLocks() {
        this.console.println("\nFunction is called");
    }

    private void playGimkink() {
        this.console.println("\nFunction is called");
    }

    private void playFizink() {
        this.console.println("/nFunction is called");
    }
    
}
