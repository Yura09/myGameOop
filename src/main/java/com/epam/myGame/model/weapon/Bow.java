package com.epam.myGame.model.weapon;

import com.epam.myGame.model.features.Damage;
import com.epam.myGame.model.features.WeaponName;

/**
 * The type Bow.
 */
public class Bow extends Weapon {
    @Override
    final public int getDamage() {
        return Damage.DAMAGE_BOW;
    }

    @Override
    final public int getFatalDamage() {
        return Damage.FATAL_DAMAGE_BOW;
    }

    @Override
    final public double getChanceOfFatalDamage() {
        return Damage.CHANCE_FATAL_BOW;
    }


}
