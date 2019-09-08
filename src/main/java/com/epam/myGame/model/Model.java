package com.epam.myGame.model;

import com.epam.myGame.model.heroes.abstractHero.Hero;

/**
 * The interface Model.
 */
public interface Model {
    /**
     * Gets name of weapon hero.
     *
     * @return the name of weapon hero
     */
    String getNameOfWeaponHero();

    /**
     * Gets name of weapon monster.
     *
     * @return the name of weapon monster
     */
    String getNameOfWeaponMonster();

    /**
     * Generate monster.
     */
    void generateMonster();

    /**
     * Gets hero.
     *
     * @return the hero
     */
    Hero getHero();

    /**
     * Gets monster.
     *
     * @return the monster
     */
    Hero getMonster();

    /**
     * Heal.
     */
    void heal();

    /**
     * Damage dealt int.
     *
     * @return the int
     */
    int damageDealt();

    /**
     * Damage received int.
     *
     * @return the int
     */
    int damageReceived();

    /**
     * Gets num health potions.
     *
     * @return the num health potions
     */
    int getNumHealthPotions();
}
