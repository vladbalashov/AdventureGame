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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack
 */
public class AdventureGame {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        AdventureGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        AdventureGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        AdventureGame.logFile = logFile;
    }

    
    public static void main(String[] args) {
        
        
        try {
            AdventureGame.inFile = new BufferedReader(new InputStreamReader(System.in));
            AdventureGame.outFile = new PrintWriter(System.out, true);
            
            String filepath = "log.txt";
            AdventureGame.logFile = new PrintWriter(filepath);
            
            StartGameView startGameView = new StartGameView();
            startGameView.displayStartGameView();}
        catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        finally {
            try {
                if (AdventureGame.inFile != null)
                    AdventureGame.inFile.close();
                if (AdventureGame.outFile != null)
                    AdventureGame.outFile.close();
                if (AdventureGame.logFile != null)
                    AdventureGame.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
}
