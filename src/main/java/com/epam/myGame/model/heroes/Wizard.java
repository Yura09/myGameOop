package com.epam.myGame.model.heroes;

import com.epam.myGame.model.features.WeaponName;
import com.epam.myGame.model.heroes.abstractHero.Hero;
import com.epam.myGame.model.weapon.Staff;

/**
 * The type Wizard.
 */
public class Wizard extends Hero {
    private String nameOfWeapon;

    /**
     * Instantiates a new Wizard.
     */
    public Wizard() {
        super();
        setWeapon(new Staff());
        setChanceOfFatalDamage(getWeapon().getChanceOfFatalDamage());
        nameOfWeapon = new Staff().getName(WeaponName.STAFF);
    }

    @Override
    public int attack(Hero hero) {
        int damage = attackDamage();
        hero.setHealth(hero.getHealth() - damage);
        // System.out.println("Wizard attacked for+ " + damage + " " + hero + "(" + hero.health + "hp)");
        return damage;
    }

    @Override
    public void heal() {
        int healHp = healHp();
        System.out.println("Wizard heald to " + healHp + "hp");
    }

    @Override
    public void resistWeapon() {

    }

    @Override
    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
