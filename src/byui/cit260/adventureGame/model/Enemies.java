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
public class Enemies implements Serializable {
    
    public enum EnemyList {
    
    Riphate,
    Sparkcoin,
    Thiefspeed,
    Venomvomit,
    Freezemiser,
    Carnalflame;
    }
    
    private String name;
    private String description;
    private double health;
    private double physicalAttack;
    private double physicalDefense;
    private double magicalAttack;
    private double magicalDefense;
    private String location;
    
    
    public Enemies () {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(double physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public double getPhysicalDefense() {
        return physicalDefense;
    }

    public void setPhysicalDefense(double physicalDefense) {
        this.physicalDefense = physicalDefense;
    }

    public double getMagicalAttack() {
        return magicalAttack;
    }

    public void setMagicalAttack(double magicalAttack) {
        this.magicalAttack = magicalAttack;
    }

    public double getMagicalDefense() {
        return magicalDefense;
    }

    public void setMagicalDefense(double magicalDefense) {
        this.magicalDefense = magicalDefense;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
   
}
