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
public class Potions implements Serializable {
    
    public enum Type {
        
        healthPotion,
        attackPotion,
        defensePotion;
    }
    
    private String name;
    private double magicalAttack;
    private double magicalDefense;
    private double health;

    public Potions() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.magicalAttack) ^ (Double.doubleToLongBits(this.magicalAttack) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.magicalDefense) ^ (Double.doubleToLongBits(this.magicalDefense) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Potions other = (Potions) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magicalAttack) != Double.doubleToLongBits(other.magicalAttack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.magicalDefense) != Double.doubleToLongBits(other.magicalDefense)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Potions{" + "name=" + name + ", magicalAttack=" + magicalAttack + ", magicalDefense=" + magicalDefense + '}';
    }

    
}
