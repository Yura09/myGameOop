package com.epam.myGame.model.weapon;

import com.epam.myGame.model.features.Damage;
import com.epam.myGame.model.features.WeaponName;

/**
 * The type Weapon.
 */
public abstract class Weapon implements Damage {

    /**
     * Gets damage.
     *
     * @return the damage
     */
    public abstract int getDamage();

    /**
     * Gets fatal damage.
     *
     * @return the fatal damage
     */
    public abstract int getFatalDamage();

    /**
     * Gets chance of fatal damage.
     *
     * @return the chance of fatal damage
     */
    public abstract double getChanceOfFatalDamage();

    /**
     * Gets name.
     *
     * @param type the type
     * @return the name of weapon
     */
    public String getName( WeaponName type) {
        switch (type) {
            case BOW:
                return "Bow";
            case STAFF:
                return "Staff";
            case SWORD:
                return "Sword";
            default:
                throw new IllegalArgumentException("incorrect inputs");
        }
    }
}
