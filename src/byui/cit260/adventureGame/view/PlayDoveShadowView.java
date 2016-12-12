/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.control.EncounterControl;
import byui.cit260.adventureGame.control.MapControl;
import byui.cit260.adventureGame.model.Game;
import byui.cit260.adventureGame.model.Map;
import byui.cit260.adventureGame.model.Weapons;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author vladbalashov
 */
public class PlayDoveShadowView extends View {
    
    public PlayDoveShadowView(){
        super(
                 "\n"
                  + "\n---------------------------------"
                  + "\nDoveShadow! Thank you for your desire to save us. We will"
                  + "\nprovide you with weapons. Please, choose one"
                  + "\n---------------------------------"
                  + "\nO - Omega"
                  + "\nW - Windwaver"
                  + "\nT - Torment"
                  + "|nM - Massacre"
                  + "\nQ - Quit to Main Menu"
                  + "\n---------------------------------");
    }
    @Override
   public boolean doAction(String value) {
       
       value = value.toUpperCase();
        
        switch (value) {
            
            case "O":
                this.useOmega();
                break;
            case "W":
                this.useWindwaver();
                break;
            case "T":
                this.useTorment();
                break;
            case "M":
                this.useMassacre();
                break;    
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
   }

    private void useOmega() {
        FightMenuView fightMenuView = new FightMenuView();
                
        // Display the main menu view
        fightMenuView.display();
    }

    private void useWindwaver() {
        
    }

    private void useTorment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void useMassacre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
