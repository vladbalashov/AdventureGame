/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.model.Map;
import byui.cit260.adventureGame.model.Scene;
import byui.cit260.adventureGame.model.Scene.SceneType;
import byui.cit260.adventureGame.model.Character;
import byui.cit260.adventureGame.model.Location;
import exceptions.MapControlException;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * 
 */
public class MapControl {
    
    protected final BufferedReader keyboard = AdventureGame.getInFile();
    protected final PrintWriter console = AdventureGame.getOutFile();

    static Map createMap() {
        Map map = new Map(20, 20);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }
    


    public static void moveCharactersToStartingLocation(Map map)
                        throws MapControlException {
        //Character[] characters = Character.values();
        
        //for (Character character : characters) {

            //MapControl.moveCharacterToLocation(character, coordinates);
        MapControl.moveCharacterToLocation(map, 1, 1);
            
        }
    //}
    
      //private static int moveCharacterToLocation(Character character, Point coordinates) {
          
      
        //return 0;
    
    
//}

    public static void moveCharacterToLocation(Map map, int row, int column) {
        
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        
        map.setCurrentRow(row);
        map.setCurrentColumn(column);

}

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "And we came to the land full of sufferings and pain...");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "Thank you for saving our people. We will be forever in debt before you!");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        Scene cullfieldScene = new Scene();
        cullfieldScene.setDescription(
                "AWelcome to Cullfield land. Here you will face your first enemy");
        cullfieldScene.setMapSymbol("CF");
        cullfieldScene.setBlocked(false);
        scenes[SceneType.cullfield.ordinal()] = cullfieldScene;
        
        Scene dalryScene = new Scene();
        dalryScene.setDescription(
                "Welcome to Dalry land.");
        dalryScene.setMapSymbol("DL");
        dalryScene.setBlocked(false);
        scenes[SceneType.dalry.ordinal()] = dalryScene;
        
        Scene holbeckScene = new Scene();
        holbeckScene.setDescription(
                "Welcome to Holbeck land.");
        holbeckScene.setMapSymbol("HB");
        holbeckScene.setBlocked(false);
        scenes[SceneType.holbeck.ordinal()] = holbeckScene;
        
        Scene lanercoastScene = new Scene();
        lanercoastScene.setDescription(
                "Welcome to Lanercoast land. Here you will face your first enemy");
        lanercoastScene.setMapSymbol("LC");
        lanercoastScene.setBlocked(false);
        scenes[SceneType.lanercoast.ordinal()] = lanercoastScene;
        
        return scenes;
    }

}
