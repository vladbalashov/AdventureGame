/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import java.io.PrintWriter;

/**
 *
 * @author vladbalashov
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = AdventureGame.getOutFile();
    private static final PrintWriter logFile = AdventureGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "--------------------------------------------------"
                  + "\n- ERROR - "+ errorMessage
                  + "\n------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
        
    }
    
}
