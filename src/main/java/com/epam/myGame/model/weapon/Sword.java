package com.epam.myGame.model.weapon;

import com.epam.myGame.model.features.Damage;

/**
 * The type Sword.
 */
public class Sword extends Weapon {
    @Override
    final public int getDamage() {
        return Damage.DAMAGE_SWORD;
    }

    @Override
    final public int getFatalDamage() {
        return Damage.FATAL_DAMAGE_SWORD;
    }

    @Override
    final public double getChanceOfFatalDamage() {
        return Damage.CHANCE_FATAL_SWORD;
    }
}
