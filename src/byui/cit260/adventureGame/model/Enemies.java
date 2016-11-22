/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.adventureGame.model;

import java.io.Serializable;

/**
 *
 * @author vladbalashov
 */
public enum Enemies implements Serializable {
    
    Riphate ("This vicious wizard is spurred onward by vengeance. He uses illusions"
            + " in his schemes, always corrupting other magic-users to achieve his goals."
            + " He has no hope."),
    Sparkcoin ("This vicious magic-user is spurred onward by fear. He uses forbidden magic"
            + " in his plots, commonly engaging in blackmail of clerical leaders to achieve "
            + "his goals. He can't resist a fight."),
    Thiefspeed ("This chaste mage is spurred onward by egotism. He uses high magic in his plots,"
            + " usually exploring distant dimensions to achieve his goals. He is hiding a dark secret."),
    Venomvomit ("This unwise witch is driven by egotism. She employs demonology in her plots, usually"
            + " summoning demon troops to achieve her goals. She has non-human ancestry."),
    Freezemiser ("This elegant magician is driven by curiosity. He uses illusions in his plans, often"
            + " decieving others with complex illusions to achieve his goals. He is haunted by dark memories."),
    Carnalflame ("This conceited wizard is motivated by revenge. He employs forbidden magic in his plots,"
            + " always unleashing unspeakable dark forces to achieve his goals. He has a peculiar affinity"
            + " for magical items.");
    
    private final String description;
    private final double health;
    
    Enemies (String description) {
        
        this.description = description;
        health = 300;
    }
    
    public String getDescription() {
        return description;
    }


    public double getHealth() {
        return health;
    }
    
}
