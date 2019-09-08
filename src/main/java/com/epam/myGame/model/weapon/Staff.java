package com.epam.myGame.model.weapon;

import com.epam.myGame.model.features.Damage;

/**
 * The type Staff.
 */
public class Staff extends Weapon {
    @Override
    final public int getDamage() {
        return Damage.DAMAGE_STAFF;
    }

    @Override
    final public int getFatalDamage() {
        return Damage.FATAL_DAMAGE_STAFF;
    }

    @Override
    final public double getChanceOfFatalDamage() {
        return Damage.CHANCE_FATAL_STAFF;
    }
}
