/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.control;

import adventuregame.AdventureGame;
import byui.cit260.adventureGame.model.Enemies;
import byui.cit260.adventureGame.model.Enemies.EnemyList;
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
import exceptions.GameControlException;
import exceptions.MapControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        
        Enemies[] enemiesList = GameControl.createEnemiesList();
        game.setEnemies(enemiesList);
        
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
    
    public static Enemies[] createEnemiesList() {
        
        Enemies[] enemy = new Enemies[6];
        
        Enemies riphate = new Enemies();
        riphate.setName("Riphate");
        riphate.setDescription("This vicious wizard is spurred onward by vengeance. He uses illusions"
            + " in his schemes, always corrupting other magic-users to achieve his goals."
            + " He has no hope.");
        riphate.setPhysicalAttack(5);
        riphate.setPhysicalDefense(1);
        riphate.setMagicalAttack(5);
        riphate.setMagicalDefense(4);
        riphate.setHealth(200);
        riphate.setLocation("Cullfield");
        enemy[EnemyList.Riphate.ordinal()] = riphate;
        
        Enemies sparkcoin = new Enemies();
        sparkcoin.setName("Sparkcoin");
        sparkcoin.setDescription("This vicious magic-user is spurred onward by fear. He uses forbidden magic"
            + " in his plots, commonly engaging in blackmail of clerical leaders to achieve "
            + "his goals. He can't resist a fight.");
        sparkcoin.setPhysicalAttack(7);
        sparkcoin.setPhysicalDefense(8);
        sparkcoin.setMagicalAttack(10);
        sparkcoin.setMagicalDefense(6);
        sparkcoin.setHealth(220);
        sparkcoin.setLocation("Cullfield");
        enemy[EnemyList.Sparkcoin.ordinal()] = sparkcoin;
        
        Enemies thiefspeed = new Enemies();
        thiefspeed.setName("Thiefspeed");
        thiefspeed.setDescription("This chaste mage is spurred onward by egotism. He uses high magic in his plots,"
            + " usually exploring distant dimensions to achieve his goals. He is hiding a dark secret.");
        thiefspeed.setPhysicalAttack(9);
        thiefspeed.setPhysicalDefense(3);
        thiefspeed.setMagicalAttack(11);
        thiefspeed.setMagicalDefense(9);
        thiefspeed.setHealth(240);
        thiefspeed.setLocation("Dalry");
        enemy[EnemyList.Thiefspeed.ordinal()] = thiefspeed;
        
        Enemies venomvomit = new Enemies();
        venomvomit.setName("Venomvomit");
        venomvomit.setDescription("This unwise witch is driven by egotism. She employs demonology in her plots, usually"
            + " summoning demon troops to achieve her goals. She has non-human ancestry.");
        venomvomit.setPhysicalAttack(12);
        venomvomit.setPhysicalDefense(12);
        venomvomit.setMagicalAttack(12);
        venomvomit.setMagicalDefense(12);
        venomvomit.setHealth(260);
        venomvomit.setLocation("Holbeck");
        enemy[EnemyList.Venomvomit.ordinal()] = venomvomit;
        
        Enemies freezemiser = new Enemies();
        freezemiser.setName("Freezemiser");
        freezemiser.setDescription("This elegant magician is driven by curiosity. He uses illusions in his plans, often"
            + " decieving others with complex illusions to achieve his goals. He is haunted by dark memories.");
        freezemiser.setPhysicalAttack(14);
        freezemiser.setPhysicalDefense(6);
        freezemiser.setMagicalAttack(18);
        freezemiser.setMagicalDefense(10);
        freezemiser.setHealth(280);
        freezemiser.setLocation("Lanercoast");
        enemy[EnemyList.Freezemiser.ordinal()] = freezemiser;
        
        Enemies carnalflame = new Enemies();
        carnalflame.setName("CarnalFlame");
        carnalflame.setDescription("This conceited wizard is motivated by revenge. He employs forbidden magic in his plots,"
            + " always unleashing unspeakable dark forces to achieve his goals. He has a peculiar affinity"
            + " for magical items.");
        carnalflame.setPhysicalAttack(15);
        carnalflame.setPhysicalDefense(10);
        carnalflame.setMagicalAttack(18);
        carnalflame.setMagicalDefense(15);
        carnalflame.setHealth(300);
        carnalflame.setLocation("Lanercoast");
        enemy[EnemyList.Carnalflame.ordinal()] = carnalflame;
        
        return enemy;
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

    public static void saveGame(Game game, String filePath)
                                throws GameControlException {
    
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
            
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    
    }

    public static void getSavedGame(String filePath)
                        throws GameControlException{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        AdventureGame.setCurrentGame(game);
    }
    
}
