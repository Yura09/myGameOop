package com.epam.myGame.controller;

import com.epam.myGame.model.heroes.abstractHero.Hero;

/**
 * The type Validator.
 */
class Validator {
    /**
     * Can heal boolean.
     *
     * @param hero the hero
     * @return the boolean
     */
    boolean canHeal(final Hero hero) {
        return hero.getNumHealthPotions() > 0;
    }
}
