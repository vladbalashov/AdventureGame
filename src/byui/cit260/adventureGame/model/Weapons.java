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
public class Weapons implements Serializable {
    
    public enum Item {
    
    omega,
    windwaver,
    torment,
    massacre,
    nimble,
    ebony,
    lifebender,
    earthsong,
    lament,
    serenity,
    moonshadow,
    fluke;
    }
    
    private String description;
    private double physicalAttack;
    private double physicalDefense;

    public Weapons() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    
}
