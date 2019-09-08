package com.epam.myGame.model.heroes.abstractHero;

/**
 * The interface Race.
 */
public interface Race {
    /**
     * Attack int.
     *
     * @param hero the hero
     * @return the int
     */
    int attack(Hero hero);

    /**
     * Heal.
     */
    void heal();

    /**
     * Resist weapon.
     */
    void resistWeapon();
}
