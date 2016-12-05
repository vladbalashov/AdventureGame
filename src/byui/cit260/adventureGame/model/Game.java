/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author vladbalashov
 */
public class Game implements Serializable {
    
    private String currentLocation;
    private double saveSlot;
    
    private Player player;
    private Enemies[] enemy;
    private Map map;
    private Scene[] scenes;
    private Weapons[] weapon;
    private Potions[] potion;

    public Game() {
    }
    
    

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public double getSaveSlot() {
        return saveSlot;
    }

    public void setSaveSlot(double saveSlot) {
        this.saveSlot = saveSlot;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemies[] getEnemies() {
        return enemy;
    }

    public void setEnemies(Enemies[] enemies) {
        this.enemy = enemies;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }
    

    public Weapons[] getWeapons() {
        return weapon;
    }

    public void setWeapons(Weapons[] weapons) {
        this.weapon = weapons;
    }

    public Potions[] getPotions() {
        return potion;
    }

    public void setPotions(Potions[] potions) {
        this.potion = potions;
    }
    
    
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.currentLocation);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.saveSlot) ^ (Double.doubleToLongBits(this.saveSlot) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "currentLocation=" + currentLocation + ", saveSlot=" + saveSlot + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saveSlot) != Double.doubleToLongBits(other.saveSlot)) {
            return false;
        }
        return true;
    }
    
    
    
}
