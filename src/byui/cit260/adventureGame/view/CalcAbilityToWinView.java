/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import byui.cit260.adventureGame.control.EncounterControl;
import byui.cit260.adventureGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author vladbalashov
 */
public class CalcAbilityToWinView {

    void displayCalcAbilityToWinView() {
        
        boolean done = false; // set flag to not done
        do {
            String quit = this.getQuit();
            if (quit.toUpperCase().equals("Q")) {// user wants to quit 
                return; }// exit the game
            //prompt for and get attack and defense characteristics
            else {
            double attackPhysical1 = this.getAttackPhysical1();
            double attackMagical1 = this.getAttackMagical1();
            double defensePhysical1 = this.getDefensePhysical1();
            double defenseMagical1 = this.getDefenseMagical1();
            double attackPhysical2 = this.getAttackPhysical2();
            double attackMagical2 = this.getAttackMagical2();
            double defensePhysical2 = this.getDefensePhysical2();
            double defenseMagical2 = this.getDefenseMagical2();
            double health1 = this.getHealth1();
            double health2 = this.getHealth2();
            
            
            // do the requested action and display the next view
            done = this.doAction(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1,
                    attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2, health1, health2);
        } }while (!done);
    }
        
    
        private String getQuit() {
            
            Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n If you want to quit press Q, if you want to stay press any button");
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length()<1 ) { // value is incorrect
                System.out.println("\nPlease, enter the value. It can not be blank");
                continue; 
         
    }
            break; // end the loop
        }
        
        return value; // return the value entered
    }


    private double getAttackPhysical1() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your physical attack");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getAttackMagical1() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your magical attack");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getDefensePhysical1() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your physical defense");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getDefenseMagical1() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your magical defense");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getAttackPhysical2() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your enemies physical attack");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered    
    }

    private double getAttackMagical2() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your enemies magical attack");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getDefensePhysical2() {
         Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your enemies physical defense");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getDefenseMagical2() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your enemies magical defense");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getHealth1() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your health");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private double getHealth2() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        Double value = null; // value to be returned
        boolean valid = false; //initialized to not valid
        
        while (!valid) {
            System.out.println("\n Please enter the level of your enemies health");
            
            value = keyboard.nextDouble(); // get next line typed on keyboard

            
            if (value < 0 ) { // value is incorrect
                System.out.println("\nPlease, enter the correct value. It can not be negative");
                continue;     
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(double attackPhysical1, double attackMagical1, double defensePhysical1,
            double defenseMagical1, double attackPhysical2, double attackMagical2,
            double defensePhysical2, double defenseMagical2, double health1, double health2) {
        
   double level = EncounterControl.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1,
                defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2,
                health1, health2);
   if (level == -1000000) {
       System.out.println("\nPlease enter correct parameters and try again");
    return false;    
   }
   else if (level<=0) {
       
       System.out.println("\nYour ability to win is " + EncounterControl.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2,
health1, health2)+ " Unfortunately it is not enough to win. Use potion for help");
    return true;
   }
   else {
    
    System.out.println("\nYour ability to win is " + EncounterControl.calcAbilityToWin(attackPhysical1, attackMagical1, defensePhysical1, defenseMagical1, attackPhysical2, attackMagical2, defensePhysical2, defenseMagical2,
health1, health2)+ "\nWe wish you luck in your fight");
    return true;
       
    }



   
    }   
}
