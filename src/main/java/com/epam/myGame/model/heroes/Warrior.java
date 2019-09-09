package com.epam.myGame.model.heroes;

import com.epam.myGame.model.features.WeaponName;
import com.epam.myGame.model.heroes.abstractHero.Hero;

import com.epam.myGame.model.weapon.Sword;

/**
 * The type Warrior.
 */
public class Warrior extends Hero {
    private String nameOfWeapon;

    /**
     * Instantiates a new Warrior.
     */
    public Warrior() {
        super();
        setWeapon(new Sword());
        setChanceOfFatalDamage(getWeapon().getChanceOfFatalDamage());
        nameOfWeapon = new Sword().getName(WeaponName.SWORD);
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public int attack(Hero hero) {
        int damage = attackDamage();
        hero.setHealth(hero.getHealth() - damage);
        return damage;
    }

    public void heal() {
        int healHp = healHp();
        System.out.println("Warrior heald to " + healHp + "hp");
    }

    public void resistWeapon() {

    }

    @Override
    public String toString() {
        return "Warrior";
    }
}
