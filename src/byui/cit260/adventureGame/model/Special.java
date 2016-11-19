/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Bart
 */
public class Special implements Serializable{
    
    private String name;
    private int level;
    private int price;
    private int uses;
    private Map<String, Integer> ability;
    private Map<String, Integer> ingredients;

    public Special() {
        ability = new TreeMap<>();
        ingredients = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public Map<String, Integer> getAbility() {
        return ability;
    }

    public void addAbility(String key, int value) {
        this.ability.put(key, value);
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public void addIngredients(String key, int value) {
        this.ingredients.put(key, value);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.level;
        hash = 97 * hash + this.price;
        hash = 97 * hash + this.uses;
        hash = 97 * hash + Objects.hashCode(this.ability);
        hash = 97 * hash + Objects.hashCode(this.ingredients);
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
        final Special other = (Special) obj;
        if (this.level != other.level) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (this.uses != other.uses) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ability, other.ability)) {
            return false;
        }
        if (!Objects.equals(this.ingredients, other.ingredients)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Special{" + "name=" + name + ", level=" + level + ", price=" + price + ", uses=" + uses + ", ability=" + ability + ", ingredients=" + ingredients + '}';
    }
    
}
