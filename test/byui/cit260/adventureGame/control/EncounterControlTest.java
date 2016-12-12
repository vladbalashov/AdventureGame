/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

import exceptions.EncounterControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vladbalashov
 */
public class EncounterControlTest {
    
    public EncounterControlTest() {
    }

    /**
     * Test of attackEnemy method, of class EncounterControl.
     */
 

    /**
     * Test of calcAbilityToWin method, of class EncounterControl.
     */
    @Test
    public void testCalcAbilityToWin() throws EncounterControlException {
        System.out.println("calcAbilityToWin");
        System.out.println("\tTest case #1");
        double attackPhysical1 = 15.0;
        double attackMagical1 = 2.0;
        double defensePhysical1 = 7.0;
        double defenseMagical1 = 4.0;
        double attackPhysical2 = 10.0;
        double attackMagical2 = 5.0;
        double defensePhysical2 = 2.0;
        double defenseMagical2 = 6.0;
        double health1 = 100.0;
        double health2 = 150.0;
        EncounterControl instance = new EncounterControl();
        double expResult = -8.33;
        double result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
       
        System.out.println("\tTest case #2");
        attackPhysical1 = 7.0;
        attackMagical1 = 7.0;
        defensePhysical1 = 14.0;
        defenseMagical1 = 17.0;
        attackPhysical2 = 18.0;
        attackMagical2 = 24.0;
        defensePhysical2 = 7.0;
        defenseMagical2 = 7.0;
        health1 = 100.0;
        health2 = 150.0;
      
        expResult = -9.09;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #3");
        attackPhysical1 = 7.0;
        attackMagical1 = 8.0;
        defensePhysical1 = 4.0;
        defenseMagical1 = 5.0;
        attackPhysical2 = 5.0;
        attackMagical2 = 4.0;
        defensePhysical2 = 8.0;
        defenseMagical2 = 7.0;
        health1 = 100.0;
        health2 = 150.0;
      
        expResult = 0;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #4");
        attackPhysical1 = -1.0;
        attackMagical1 = 2.0;
        defensePhysical1 = 7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 2.0;
        defenseMagical2 = 6.0;
        health1 = 100.0;
        health2 = 150.0;
      
        expResult = -1000000;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #5");
        attackPhysical1 = 15.0;
        attackMagical1 = 2.0;
        defensePhysical1 = -7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 2.0;
        defenseMagical2 = 6.0;
        health1 = 100.0;
        health2 = 150.0;
      
        expResult = -1000000;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #6");
        attackPhysical1 = 15.0;
        attackMagical1 = 2.0;
        defensePhysical1 = 7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 2.0;
        defenseMagical2 = 6.0;
        health1 = 0.0;
        health2 = 150.0;
      
        expResult = -1000000;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #7");
        attackPhysical1 = 15.0;
        attackMagical1 = 2.0;
        defensePhysical1 = 7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 2.0;
        defenseMagical2 = 6.0;
        health1 = 100.0;
        health2 = -6.0;
      
        expResult = -1000000;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #8");
        attackPhysical1 = 15.0;
        attackMagical1 = 2.0;
        defensePhysical1 = 7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 2.0;
        defenseMagical2 = 6.0;
        health1 = 0.0;
        health2 = 10000.0;
      
        expResult = -1000000;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #9");
        attackPhysical1 = 15.0;
        attackMagical1 = 2.0;
        defensePhysical1 = 7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 2.0;
        defenseMagical2 = 6.0;
        health1 = 10000.0;
        health2 = 0.0;
      
        expResult = -1000000;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);
        
        System.out.println("\tTest case #10");
        attackPhysical1 = 1.0;
        attackMagical1 = 1.0;
        defensePhysical1 = 7.0;
        defenseMagical1 = 4.0;
        attackPhysical2 = 10.0;
        attackMagical2 = 5.0;
        defensePhysical2 = 1.0;
        defenseMagical2 = 2.0;
        health1 = 10000.0;
        health2 = 10000.0;
      
        expResult = -12500;
        result = instance.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        assertEquals(expResult, result, 0.004);

    }
      @Test
    public void testCalcPotionNeeded() {
        System.out.println("calcPotionNeeded");
        System.out.println("\tTest case #1");
        double defense1 = 15.0;
        double defense2 = 14.0;
        double attack1 = 20.0;
        double attack2 = 21;
        
        EncounterControl instance = new EncounterControl();
        double expResult = 1;
        double result = instance.calcPotionNeeded(defense1, defense2, attack1, attack2);
        assertEquals(expResult, result, 0.001);
        
        System.out.println("\tTest case #2");
        defense1 = -15.0;
        defense2 = 14.0;
        attack1 = 20.0;
        attack2 = 21;
        
        expResult = -1000000;
        result = instance.calcPotionNeeded(defense1, defense2, attack1, attack2);
        assertEquals(expResult, result, 0.001);
        
        System.out.println("\tTest case #3");
        defense1 = 15.0;
        defense2 = 15.0;
        attack1 = 20.0;
        attack2 = 21;
        
        expResult = 0;
        result = instance.calcPotionNeeded(defense1, defense2, attack1, attack2);
        assertEquals(expResult, result, 0.001);
    
}
}

