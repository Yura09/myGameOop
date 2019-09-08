package com.epam.myGame.model.heroes.heroCreation;

import com.epam.myGame.model.heroes.Archer;
import com.epam.myGame.model.heroes.abstractHero.Hero;
import com.epam.myGame.model.heroes.Warrior;
import com.epam.myGame.model.heroes.Wizard;

import java.util.Random;

/**
 * The type Monster.
 */
public class Monster {
    /**
     * Generate monster hero.
     *
     * @return the hero
     * @throws IllegalArgumentException the illegal argument exception
     */
    public static Hero generateMonster() throws IllegalArgumentException {
        Random rand = new Random();
        while (true) {
            switch (rand.nextInt(3) + 1) {
                case 1:
                    return new Warrior();
                case 2:
                    return new Wizard();
                case 3:
                    return new Archer();
                default:
                    throw new IllegalArgumentException("incorrect Inputs");
            }
        }
    }
}
