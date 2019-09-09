package com.epam.myGame.controller;

import com.epam.myGame.model.heroes.abstractHero.Hero;

/**
 *Interface Controller.
 */
public interface Controller {

    /**
     * Generate monster.
     */
    void generateMonster();

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
     * Is hero dead boolean.
     *
     * @return the boolean
     */
    boolean isHeroDead();

    /**
     * Is monster dead boolean.
     *
     * @return the boolean
     */
    boolean isMonsterDead();

    /**
     * Damage received int.
     *
     * @return the int
     */
    int damageReceived();

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
     * Gets monster.
     *
     * @return the monster
     */
    String getMonster();

    /**
     * Gets hero.
     *
     * @return the hero
     */
    String getHero();

    /**
     * Gets health of hero.
     *
     * @return the health of hero
     */
    int getHealthOfHero();

    /**
     * Gets health of monster.
     *
     * @return the health of monster
     */
    int getHealthOfMonster();

    /**
     * Gets num health potions.
     *
     * @return the num health potions
     */
    int getNumHealthPotions();

}
