package com.epam.myGame.model.heroes;

import com.epam.myGame.model.features.WeaponName;
import com.epam.myGame.model.heroes.abstractHero.Hero;
import com.epam.myGame.model.weapon.Bow;


/**
 * The type Archer.
 */
public class Archer extends Hero {
    private String nameOfWeapon;
    /**
     * Instantiates a new Archer.
     */
    public Archer() {
        super();
        setWeapon(new Bow());
        setChanceOfFatalDamage(getWeapon().getChanceOfFatalDamage());
        nameOfWeapon = new Bow().getName(WeaponName.BOW);
    }
    public int attack(Hero hero) {
        int damage = attackDamage();
        hero.setHealth(hero.getHealth() - damage);
        // System.out.println("Archer attacked for+ " + damage + " " + hero + "(" + hero.health + "hp)");
        return damage;
    }
    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void heal() {
        int healHp = healHp();
        System.out.println("Archer heald for " + healHp + "HP");
    }
    public void resistWeapon() {
    }
    @Override
    public String toString() {
        return "Archer";
    }
}
