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
 * @author Jack
 */
public enum Character implements Serializable{
    
    DoveShadow("There's something appealing about him, perhaps it's a feeling of guilt"
            + " or perhaps it's simply his hatred. But nonetheless, people tend to stay"
            + " on his good side, while thinking of ways to become his friend."),
    AllysonLocks("There's something bewildering about her, perhaps it's a feeling of"
            + " hospitality or perhaps it's simply a feeling of coldness. But"
            + " nonetheless, people tend to invite her into their homes, while"
            + " spreading stories about her."),
    Gimkink("There's something captivating about him, perhaps it's his good looks or"
            + " perhaps it's simply his suffering. But nonetheless, people tend to ask"
            + " him about his latest victory, while befriending his friends to get closer to him."),
    
    Fizink("There's something curious about him, perhaps it's his suffering or perhaps it's"
            + " simply his hatred. But nonetheless, people tend to ask him for favors, while"
            + " hoping he will one day be their leader.");
    
    
    // class instance variables
    private final String description;
    private final double health;
    private final double physicalAttack;
    private final double physicalDefense;
    private final double magicalAttack;
    private final double magicalDefense;
    
    private Weapons[] weapons;
    private Potions[] potions;
    

    Character(String description) {

    this.description = description;
    health = 200;
    physicalAttack=7;
    physicalDefense=5;
    magicalAttack=4;
    magicalDefense=3;
    
    }


    public String getDescription() {
        return description;
    }


    public double getHealth() {
        return health;
    }
    
    public double getPhysicalAttack() {
        return physicalAttack;
    }
    
    public double getPhysicalDefense() {
        return physicalDefense;
    }
    
    public double getMagicalAttack() {
        return magicalAttack;
    }
    
    public double getMagicalDefense() {
        return magicalDefense;
    }

    public Weapons[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons[] weapons) {
        this.weapons = weapons;
    }

    public Potions[] getPotions() {
        return potions;
    }

    public void setPotions(Potions[] potions) {
        this.potions = potions;
    }
    
    
    
}