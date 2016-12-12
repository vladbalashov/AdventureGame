/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.control.EncounterControl;
import byui.cit260.adventureGame.model.Enemies;
import byui.cit260.adventureGame.model.Enemies.EnemyList;
import byui.cit260.adventureGame.model.Game;
import exceptions.EncounterControlException;
import byui.cit260.adventureGame.view.FinalStageView;

/**
 *
 * @author vladbalashov
 */
public class FightMenuView extends View {
    
    public FightMenuView(){
       
        super(
                 "\n"
                  + "\n---------------------------------"
                  + "\nIt is time for fight. Your first enemy is Riphate."
                  + "\nWould you like to attack?"
                  + "\nY - Yes"
                  + "\nQ - Quit to Main Menu"
                  + "\n---------------------------------");
    }
    
     public boolean doAction(String value) {
       
       value = value.toUpperCase();
       
       switch (value) {
           
           case "Y":
               
              this.attackRiphate();
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try again");
               break;
       }
       return false;
     }

    private void attackRiphate() {
        Game game = AdventureGame.getCurrentGame();
        Enemies[] enemy = game.getEnemies();
        
        try {EncounterControl.attackRiphate(enemy);
            
        }catch(EncounterControlException me){
        this.console.println(me.getMessage());
   }
        
        FinalStageView finalStageView = new FinalStageView();
                
        // Display the main menu view
        finalStageView.display();
    }
}
