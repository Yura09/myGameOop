package com.epam.myGame.model.heroes.heroCreation;

import com.epam.myGame.model.heroes.Archer;
import com.epam.myGame.model.heroes.abstractHero.Hero;
import com.epam.myGame.model.heroes.Warrior;
import com.epam.myGame.model.heroes.Wizard;

import java.util.Scanner;

/**
 * The type Concrete hero.
 */
public class ConcreteHero {
    /**
     * Generate hero hero.
     *
     * @return the hero
     * @throws IllegalArgumentException the illegal argument exception
     */
    public static Hero generateHero() throws IllegalArgumentException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose your hero:");
        System.out.println("1. Warrior");
        System.out.println("2. Wizard ");
        System.out.println("3. Archer");
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose Warrior");
                return new Warrior();
            case 2:
                System.out.println("You chose Wizard");
                return new Wizard();
            case 3:
                System.out.println("You chose Archer");
                return new Archer();
            default:
                throw new IllegalArgumentException("incorrect Inputs");
        }
    }
}
