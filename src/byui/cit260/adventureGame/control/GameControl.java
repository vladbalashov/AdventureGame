/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.model.Player;

/**
 *
 * @author Jack
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        AdventureGame.setPlayer(player); //save the player
        
        return player;
    }
    
    public static void createNewGame (Player player) {
        System.out.println("\n*** create NewGame stub function called ***");
    }
    
}
