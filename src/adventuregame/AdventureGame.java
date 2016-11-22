/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;
import byui.cit260.adventureGame.model.Character;
import byui.cit260.adventureGame.model.Game;
import byui.cit260.adventureGame.model.Map;
import byui.cit260.adventureGame.model.Player;
import byui.cit260.adventureGame.view.StartGameView;

/**
 *
 * @author Jack
 */
public class AdventureGame {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AdventureGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AdventureGame.player = player;
    }

    
    public static void main(String[] args) {
        
        StartGameView startGameView = new StartGameView();
        startGameView.displayStartGameView();
    }
    
}
