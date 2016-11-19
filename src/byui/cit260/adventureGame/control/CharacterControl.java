/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

/**
 *
 * @author Jack
 */
public class CharacterControl {

    public String chooseCharacter(String name, int health, boolean hostile,
         String faction, int attackPhysical, int defensePhysical,
         int attackMagical, int defenseMagical){
      return "This is the return statement from chooseCharacter()\n";
} 
 
    public String chooseWeapon( int attackPhysical, int defensePhysical,
         int attackMagical, int defenseMagical){
      return "This is the return statement from chooseWeapon()\n";        
}

public String choosePotion( int attackPhysical, int defensePhysical,
         int attackMagical, int defenseMagical){
      return "This is the return statement from choosePotion()\n"; 
}

}
