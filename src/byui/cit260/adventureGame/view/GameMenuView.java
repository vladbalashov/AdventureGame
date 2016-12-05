/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.view;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.control.GameControl;
import byui.cit260.adventureGame.model.Enemies;
import byui.cit260.adventureGame.model.Game;
import byui.cit260.adventureGame.model.Location;
import byui.cit260.adventureGame.model.Map;
import byui.cit260.adventureGame.model.Scene;
import byui.cit260.adventureGame.model.Weapons;
import exceptions.GameControlException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 *
 * @author vladbalashov
 */
public class GameMenuView extends View {
    
    
    public GameMenuView(){
        
        super ( 
                "\n"
                  + "\n---------------------------------"
                  + "\n| Game Menu"
                  + "\n---------------------------------"
                  + "\nC - Choose character"
                  + "\nL - Choose location"
                  + "\nM - Display Map"
                  + "\nW - View Weapons"
                  + "\nF - View Weapon with Max level of Physical Attack"
                  + "\nP - View Potions"
                  + "\nE - View Enemies"
                  + "\nA - Calculate ability to win"
                  + "\nQ - Quit to Main Menu"
                  + "\n---------------------------------");
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "C": // create and start a new game
                this.chooseCharacter();
                break;
            case "M":
                this.displayMap();
                break;
            case "L":
                this.chooseLocation();
                break;
            case "W":
                this.viewWeapons();
                break;
            case "F":
                this.findWeaponWithMaxPhysicalAttack();
                break;
            case "P":
                this.viewPotions();
                break;
            case "A":
                this.displayCalcAbilityToWinView();
                break;
            case "E":
                this.viewEnemies();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
                
        }
        return false;
    }

    private void chooseCharacter() {
         System.out.println("\n*** chooseCharacter() function called ***");
    }

    private void chooseLocation() {
        ChooseLocationView chooseLocationView = new ChooseLocationView();
        
        chooseLocationView.display();
    }


    private void displayCalcAbilityToWinView() {
        CalcAbilityToWinView calcAbilityToWinView = new CalcAbilityToWinView();
                
        // Display the main menu view
        calcAbilityToWinView.displayCalcAbilityToWinView();
    }

    private void viewWeapons() {
        StringBuilder line;
        
        Game game = AdventureGame.getCurrentGame();
        Weapons[] weapon = game.getWeapons();
        
        this.console.println("\n LIST OF WEAPONS");
        line = new StringBuilder("                                              ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "PH. ATTACK");
        line.insert(31, "PH. DEFENSE");
        this.console.println(line.toString());
        
        for (Weapons item : weapon) {
            line = new StringBuilder("                                          ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPhysicalAttack());
            line.insert(33, item.getPhysicalDefense());
            
            this.console.println(line.toString());
        }
        
    }

    private void viewPotions() {
        System.out.println("\n function viewPotions() was called"); 
    }

    private void displayMap() {
       
        Game game = AdventureGame.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        Location location = new Location();
        String line;
        
        this.console.println("----------------------Adventure Game Map-------------------- ");
        this.console.println("  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19");
        this.console.println("-------------------------------------------------------------");
        
        location = map.locations[0][0];
        for (int row = 0; row < 20; row++) {
            line = String.valueOf(row); 
            for (int column = 0; column < 20; column++) {
                if (locations[row][column].getScene()==null){
                location = locations[row][column];
                line += "|" + "??";
            }
                else{
                    location = locations[row][column];
                    line += "|" + location.getScene().getMapSymbol();
                }
            }
            this.console.println(line + "|");
        }
        this.console.println("-------------------------------------------------------------");
      }

    private void findWeaponWithMaxPhysicalAttack() {
        Game game = AdventureGame.getCurrentGame();
        Weapons[] weapon = game.getWeapons();
        
        String weaponWithGreatAttack = weapon[GameControl.findWeaponWithMaxPhysicalAttack(weapon)].getDescription();
        this.console.println("\nWeapon with maximum level of Physical Attack is "+weaponWithGreatAttack);
    }

    private void viewEnemies() {
       this.console.println("\n\nEnter the filepath where the list should be saved:");
        String filePath = this.getInput();
    
        
        try {
            saveListOfEnemies(filePath);
            this.console.println("Your file was succesfully saved to "+ filePath);
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void saveListOfEnemies(String filePath) 
                        throws GameControlException {
        
        Game game = AdventureGame.getCurrentGame();
        Enemies[] enemy = game.getEnemies();
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println("\n\nList of Enemies");
            out.printf("%n%-15s%-12s%-10s%-18s%-20s%-18s%-19s", "Name", "Location", "Health", "Physical Attack",
                    "Physical Defense", "Magical Attack", "Magical Defense");
            out.printf("%n%-15s%-12s%-10s%-18s%-20s%-18s%-19s", "----", "--------", "------", "---------------",
                    "----------------", "--------------", "---------------");
            
            for (Enemies enemyList : enemy) {
                
                out.printf("%n%-15s%-12s%-10s%-18s%-20s%-18s%-19s", enemyList.getName(), enemyList.getLocation(),
                        enemyList.getHealth(), enemyList.getPhysicalAttack(), enemyList.getPhysicalDefense(),
                        enemyList.getMagicalAttack(), enemyList.getMagicalDefense());
                
            }
            
        }catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
                
    
 
}
