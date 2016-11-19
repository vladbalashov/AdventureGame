/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import byui.cit260.adventureGame.model.Character;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author vladbalashov
 */
public class PartyComposition implements Serializable{
    
    private Character[] characterList;

    public PartyComposition() {
    }
    
    

    public Character[] getParty() {
        return characterList;
    }

    public void setCharacterList(Character[] CharacterName) {
        this.characterList = characterList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.characterList);
        return hash;
    }

    @Override
    public String toString() {
        String returnString = "PartyComposition:";
        for (Character c : characterList) {
            returnString += " " + c.getName();
        }
        return returnString;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PartyComposition other = (PartyComposition) obj;
        if (!Objects.equals(this.characterList, other.characterList)) {
            return false;
        }
        return true;
    }
    
    
    
}
