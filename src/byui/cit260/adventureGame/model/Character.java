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
public class Character implements Serializable{
    
    // class instance variables
    private String name;
    private double level;
    private boolean health;
    private String faction;
    private int attackPhysical;
    private int defensePhysical;
    private int attackMagical;
    private int defenseMagical;

    public Character() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public int getAttackPhysical() {
        return attackPhysical;
    }

    public void setAttackPhysical(int attackPhysical) {
        this.attackPhysical = attackPhysical;
    }

    public int getDefensePhysical() {
        return defensePhysical;
    }

    public void setDefensePhysical(int defensePhysical) {
        this.defensePhysical = defensePhysical;
    }

    public int getAttackMagical() {
        return attackMagical;
    }

    public void setAttackMagical(int attackMagical) {
        this.attackMagical = attackMagical;
    }

    public int getDefenseMagical() {
        return defenseMagical;
    }

    public void setDefenseMagical(int defenseMagical) {
        this.defenseMagical = defenseMagical;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.level) ^ (Double.doubleToLongBits(this.level) >>> 32));
        hash = 71 * hash + (this.health ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.faction);
        hash = 71 * hash + this.attackPhysical;
        hash = 71 * hash + this.defensePhysical;
        hash = 71 * hash + this.attackMagical;
        hash = 71 * hash + this.defenseMagical;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.level) != Double.doubleToLongBits(other.level)) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (this.attackPhysical != other.attackPhysical) {
            return false;
        }
        if (this.defensePhysical != other.defensePhysical) {
            return false;
        }
        if (this.attackMagical != other.attackMagical) {
            return false;
        }
        if (this.defenseMagical != other.defenseMagical) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.faction, other.faction);
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", level=" + level + ", health=" + health + ", faction=" + faction + ", attackPhysical=" + attackPhysical + ", defensePhysical=" + defensePhysical + ", attackMagical=" + attackMagical + ", defenseMagical=" + defenseMagical + '}';
    }
}