/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

import exceptions.EncounterControlException;

/**
 *
 * @author Jack
 */
public class EncounterControl {

public String attackEnemy(int attackPhysical, int defensePhysical, 
         int attackMagical, int defenseMagical, int health){
   return "This is the return statement from attackEnemy()\n";      
}
public String usePotion(String name, int amount) {
   return "This is the return statement from usePotion()\n";      
}
public String getReward(String weapon, String potion, String ingredients) {
   return "This is the return statement from getReward()\n";      
}
public String addToCharacter(String item, int amount) {
   return "This is the return statement from addToCharacter()\n"; 
}
public static double calcAbilityToWin(double attackPhysical1, double attackMagical1,
        double defensePhysical1, double defenseMagical1, double attackPhysical2, double attackMagical2,
        double defensePhysical2, double defenseMagical2, double health1, double health2 ) throws 
                                                            EncounterControlException{
    
    if (attackPhysical1<0 || attackMagical1<0 || defensePhysical1<0 || defenseMagical1<0
    || attackPhysical2<0 || attackMagical2<0 || defensePhysical2<0 || defenseMagical2<0) {
        throw new EncounterControlException("None of these parameters can be negative or equal to zero.");
    }
    
    if (health1<=0 || health1>10000 || health2<=0 || health2>10000) {
        throw new EncounterControlException("Health should be more than zero and less that 10,000");
    }
    
    double attack1 = attackPhysical1 + attackMagical1;
    double defense1 = defensePhysical1 + defenseMagical1;
    double attack2 = attackPhysical2 + attackMagical2;
    double defense2 = defensePhysical2 + defenseMagical2;
    double check1 = attack1 - defense2;
    double check2 = attack2 - defense1;
    
    if (check1 == 0 && check2 == 0) {
        throw new EncounterControlException("You are equal to your enemy. Please use potion to win ");
    }

    if (check1==0 && check2>0){
        double level = 0 - health1/check2;
        if (level <= 0){
            throw new EncounterControlException("Your ability to win is "+level+ " Unfortunately it is not enough to win."
                    + " Please use potion to win");
        }
        else {
            throw new EncounterControlException("Your ability to win is "+level+" We wish you luck in your fight");
        }
    }

    if (check1==0 && check2<0){
        throw new EncounterControlException("You are equal to your enemy. Please use potion to win ");
    }

    if (check2==0 && check1>0) {
        double level = health2/check1;
        if (level <= 0){
            throw new EncounterControlException("Your ability to win is "+level+ " Unfortunately it is not enough to win."
                    + " Please use potion to win");
        }
        else {
            throw new EncounterControlException("Your ability to win is "+level+" We wish you luck in your fight");
        }
    }

    if (check2==0 && check1<0) {
        throw new EncounterControlException("You are equal to your enemy. Please use potion to win ");
    }

    double level = health2/check1 - health1/check2;
    if (level <= 0){
            throw new EncounterControlException("Your ability to win is "+level+ " Unfortunately it is not enough to win."
                    + " Please use potion to win");
        }
        else {
            throw new EncounterControlException("Your ability to win is "+level+" We wish you luck in your fight");
        }
   
}
public double calcPotionNeeded(double defense1, double defense2, double attack1, double attack2) {
    
    if (defense1<0 || defense2<0 || attack1<0 || attack2<0){
    return -1000000;
    }
    double defense = defense2 - defense1;
    double attack = attack2 - attack1;
    
    if (defense > 0 && attack > 0) {
        return 0;
    }
    
    if (defense > 0 && attack <=0) {
        double number = 0 - attack;
        return number;
    }
    
    if (defense <=0 && attack >0) {
        double number = 0 - defense;
        return number;
    }
    double number = defense + attack;
    return number;           
}



}
