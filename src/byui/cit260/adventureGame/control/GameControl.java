/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.model.Enemies;
import byui.cit260.adventureGame.model.Game;
import byui.cit260.adventureGame.model.Location;
import byui.cit260.adventureGame.model.Map;
import byui.cit260.adventureGame.model.Player;
import byui.cit260.adventureGame.model.Potions;
import byui.cit260.adventureGame.model.Potions.Type;
import byui.cit260.adventureGame.model.Scene;
import byui.cit260.adventureGame.model.Scene.SceneType;
import byui.cit260.adventureGame.model.Weapons;
import byui.cit260.adventureGame.model.Weapons.Item;
import exceptions.MapControlException;

/**
 *
 * @author Jack
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        AdventureGame.setPlayer(player); //save the player
        
        return player;
    }
    
    public static void createNewGame (Player player) {
        
        Game game = new Game();
        AdventureGame.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Weapons[] weaponsList = GameControl.createWeaponsList();
        game.setWeapons(weaponsList);
        
        Potions [] potionsList = GameControl.createPotionsList();
        game.setPotions(potionsList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        try{MapControl.moveCharactersToStartingLocation(map);}
        catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
        
    }

    public static Weapons[] createWeaponsList() {
        
        Weapons[] weapon = new Weapons[12];
        
        Weapons omega = new Weapons();
        omega.setDescription("Omega");
        omega.setPhysicalAttack(5);
        omega.setPhysicalDefense(1);
        weapon[Item.omega.ordinal()] = omega;
        
        Weapons windwaver = new Weapons();
        windwaver.setDescription("Windwaver");
        windwaver.setPhysicalAttack(7);
        windwaver.setPhysicalDefense(4);
        weapon[Item.windwaver.ordinal()] = windwaver;
        
        Weapons torment = new Weapons();
        torment.setDescription("Torment");
        torment.setPhysicalAttack(10);
        torment.setPhysicalDefense(0);
        weapon[Item.torment.ordinal()] = torment;
        
        Weapons massacre = new Weapons();
        massacre.setDescription("Massacre");
        massacre.setPhysicalAttack(4);
        massacre.setPhysicalDefense(4);
        weapon[Item.massacre.ordinal()] = massacre;
        
        Weapons nimble = new Weapons();
        nimble.setDescription("Nimble");
        nimble.setPhysicalAttack(15);
        nimble.setPhysicalDefense(8);
        weapon[Item.nimble.ordinal()] = nimble;
        
        Weapons ebony = new Weapons();
        ebony.setDescription("Ebony");
        ebony.setPhysicalAttack(5);
        ebony.setPhysicalDefense(15);
        weapon[Item.ebony.ordinal()] = ebony;
        
        Weapons lifebender = new Weapons();
        lifebender.setDescription("Lifebender");
        lifebender.setPhysicalAttack(20);
        lifebender.setPhysicalDefense(0);
        weapon[Item.lifebender.ordinal()] = lifebender;
        
        Weapons earthsong = new Weapons();
        earthsong.setDescription("Earthsong");
        earthsong.setPhysicalAttack(13);
        earthsong.setPhysicalDefense(7);
        weapon[Item.earthsong.ordinal()] = earthsong;
        
        Weapons lament = new Weapons();
        lament.setDescription("Lament");
        lament.setPhysicalAttack(3);
        lament.setPhysicalDefense(16);
        weapon[Item.lament.ordinal()] = lament;
        
        Weapons serenity = new Weapons();
        serenity.setDescription("Serenity");
        serenity.setPhysicalAttack(7);
        serenity.setPhysicalDefense(15);
        weapon[Item.serenity.ordinal()] = serenity;
        
        Weapons moonshadow = new Weapons();
        moonshadow.setDescription("Moonshadow");
        moonshadow.setPhysicalAttack(30);
        moonshadow.setPhysicalDefense(6);
        weapon[Item.moonshadow.ordinal()] = moonshadow;
        
        Weapons fluke = new Weapons();
        fluke.setDescription("Fluke");
        fluke.setPhysicalAttack(14);
        fluke.setPhysicalDefense(14);
        weapon[Item.fluke.ordinal()] = fluke;  
        
        return weapon;
        

    }

    private static Potions[] createPotionsList() {
        
        Potions[] potion = new Potions[12];
        
        Potions healthPotion = new Potions();
        healthPotion.setHealth(50);
        potion[Type.healthPotion.ordinal()] = healthPotion;
        
        Potions attackPotion = new Potions();
        attackPotion.setMagicalAttack(7);
        potion[Type.attackPotion.ordinal()] = attackPotion;
        
        Potions defensePotion = new Potions();
        defensePotion.setMagicalDefense(7);
        potion[Type.defensePotion.ordinal()] = defensePotion;
        
        return potion;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][4].setScene(scenes[SceneType.start.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.cullfield.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.dalry.ordinal()]);
        locations[4][10].setScene(scenes[SceneType.holbeck.ordinal()]);
        locations[6][12].setScene(scenes[SceneType.lanercoast.ordinal()]);
        locations[8][14].setScene(scenes[SceneType.finish.ordinal()]);
    }

   public static int findWeaponWithMaxPhysicalAttack(Weapons[] weapon){
       
       int weaponsIndex = 0;
       double maxValue = weapon[0].getPhysicalAttack();
       for(int i=1; i < weapon.length-1; i++ ) {
           if (weapon[i].getPhysicalAttack()> maxValue){
               maxValue = weapon[i].getPhysicalAttack();
               weaponsIndex = i;
           }
         
       }
       return weaponsIndex;
    
    
} 
    
}
