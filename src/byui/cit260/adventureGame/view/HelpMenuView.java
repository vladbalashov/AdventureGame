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
public class HelpMenuView extends View {
    
    
    public HelpMenuView (){
        super (
                 "\n"
                  + "\n---------------------------------"
                  + "\n| Help Menu"
                  + "\n---------------------------------"
                  + "\nG - What is the goal of the game"
                  + "\nM - How to move"
                  + "\nW - How to win"
                  + "\nQ - Quit to Main Menu"
                  + "\n---------------------------------");
    }
    
    
        
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        
        switch (value) {
            case "G": // goal of the game
                System.out.println("\n****************************************"
                                 + "\n*-----------Goal of the Game-----------*"
                                 + "\n* The main goal of this game is to help*"
                                 + "\n* people of the land and win all       *"
                                 + "\n* monsters. Also to obtain love        *"
                                 + "\n*--------------------------------------*"
                                 + "\n****************************************");
                break;
            case "M":
                System.out.println("\n****************************************"
                                 + "\n*-------------How to Move--------------*"
                                 + "\n* This part is under construction      *"
                                 + "\n*                                      *"
                                 + "\n*                                      *"
                                 + "\n*--------------------------------------*"
                                 + "\n****************************************");
                break;
            case "W":
                System.out.println("\n****************************************"
                                 + "\n*--------------How to Win--------------*"
                                 + "\n* This part is under construction      *"
                                 + "\n*                                      *"
                                 + "\n*                                      *"
                                 + "\n*--------------------------------------*"
                                 + "\n****************************************");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
        
    }
}
