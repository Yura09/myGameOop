package com.epam.myGame.controller;

import com.epam.myGame.model.Arena;
import com.epam.myGame.model.Model;
/**
 * The type Controller.
 */
public class ControllerImpl implements Controller {
    private Model model;

    private Validator validator = new Validator();

    /**
     * Instantiates a new Controller.
     */
    public ControllerImpl() {
        try {
            model = new Arena();
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
            System.exit(0);
        }
    }

    public void generateMonster() {
        model.generateMonster();
    }

    @Override
    public void heal() {
        if (validator.canHeal(model.getHero())) {
            model.heal();
        } else {
            System.out.println("\t> You have no potions left");
        }
    }

    @Override
    public boolean isHeroDead() {
        return model.getHero().isDead();
    }

    @Override
    public boolean isMonsterDead() {

        if (model.getMonster().isDead()) {
            model.getHero().setNumHealthPotions(model.getHero().getNumHealthPotions() + 1);
            return true;
        }
        return false;
    }

    @Override
    public int damageDealt() {
        return model.damageDealt();
    }

    @Override
    public int damageReceived() {
        return model.damageReceived();
    }

    @Override
    public String getNameOfWeaponHero() {
        return model.getNameOfWeaponHero();
    }

    public String getNameOfWeaponMonster() {
        return model.getNameOfWeaponMonster();
    }

    @Override
    public String getHero() {
        return model.getHero().toString();
    }

    @Override
    public int getHealthOfHero() {
        return model.getHero().getHealth();
    }

    @Override
    public int getHealthOfMonster() {
        return model.getMonster().getHealth();
    }

    @Override
    public int getNumHealthPotions() {
        return model.getNumHealthPotions();
    }

    @Override
    public String getMonster() {
        return model.getMonster().toString();
    }
}
