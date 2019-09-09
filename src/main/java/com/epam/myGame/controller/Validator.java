package com.epam.myGame.controller;

import com.epam.myGame.model.heroes.abstractHero.Hero;

/**
 * class Validator.
 */
class Validator {
    /**
     * Can heal boolean.
     *
     * @param hero - current hero
     * @return is hero can heal
     */
    boolean canHeal(final Hero hero) {
        return hero.getNumHealthPotions() > 0;
    }
}
