/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import java.io.Serializable;

/**
 *
 * @author vladbalashov
 */
public class Scene implements Serializable{
    
    public enum SceneType {
        start,
        cullfield,
        dalry,
        holbeck,
        lanercoast,
        finish;
    }
    
    public String description;
    public String mapSymbol;
    public boolean blocked;

    public Scene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    
    
    
}
