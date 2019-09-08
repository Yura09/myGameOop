package com.epam.myGame.model;

import com.epam.myGame.model.heroes.heroCreation.ConcreteHero;
import com.epam.myGame.model.heroes.abstractHero.Hero;
import com.epam.myGame.model.heroes.heroCreation.Monster;
/**
 * The type Arena.
 */
public class Arena implements Model {
    private Hero hero;
    private Hero monster;

    /**
     * Instantiates a new Arena.
     *
     * @throws IllegalArgumentException the illegal argument exception
     */
    public Arena() throws IllegalArgumentException {
        hero = ConcreteHero.generateHero();
        monster = Monster.generateMonster();
    }

    @Override
    public void generateMonster() {
        monster = Monster.generateMonster();
    }

    @Override
    public String getNameOfWeaponHero() {
        return hero.getNameOfWeapon();
    }

    @Override
    public String getNameOfWeaponMonster() {
        return monster.getNameOfWeapon();
    }

    @Override
    public Hero getMonster() {
        return monster;
    }

    @Override
    public void heal() {
        hero.heal();
    }

    @Override
    public int damageDealt() {
        return hero.attack(monster);
    }

    @Override
    public int damageReceived() {
        return monster.attack(hero);
    }

    @Override
    public Hero getHero() {
        return hero;
    }

    @Override
    public int getNumHealthPotions() {
        return hero.getNumHealthPotions();
    }

}
