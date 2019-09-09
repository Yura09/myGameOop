package com.epam.myGame.model.heroes.abstractHero;

import com.epam.myGame.model.features.Heal;
import com.epam.myGame.model.features.Health;
import com.epam.myGame.model.features.Mana;
import com.epam.myGame.model.weapon.Weapon;

import java.util.Random;

/**
 * The abstract class Hero.
 * This class contains data about hero.
 */
public abstract class Hero implements Race, Heal, Health, Mana {
    private final Random random = new Random();
    /**
     * Health of the hero.
     */
    private int health;
    /**
     * Mana of the hero.
     */
    private int mana;
    /**
     * Damage that hero do using weapon.
     */
    private int damage;
    /**
     * Number of health potions that hero has.
     */
    private int numHealthPotions;
    /**
     * Chance of fatal damage which hero can do using weapon.
     */
    private double chanceOfFatalDamage;
    /**
     * Hero's weapon.
     */
    private Weapon weapon;

    /**
     * Instantiates a new Hero with random health, mana and number of health potions
     */
    public Hero() {
        this.health = random.nextInt(MAX_HEALTH - MIN_HEALTH) + MIN_HEALTH;
        this.mana = random.nextInt(MAX_MANA - MIN_MANA) + MIN_MANA;
        numHealthPotions = NUM_HEALTH_POTIONS;
    }

    /**
     * This method heal the hero and lose one health potion.
     *
     * @return current health of hero.
     */
    protected int healHp() {
        int healHp = random.nextInt(Heal.MAX_HEAL - Heal.MIN_HEAL) + MIN_HEAL;
        --numHealthPotions;
        this.health += healHp;
        return this.health;
    }

    /**
     * Get number of health potions.
     *
     * @return Number of health potions.
     */
    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    /**
     * Set number of health potions.
     *
     * @param numHealthPotions - the number of health potions.
     */
    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }

    /**
     * Get health.
     *
     * @return the health of hero.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Is current hero dead.
     *
     * @return boolean type - is hero dead or no.
     */
    public boolean isDead() {
        if (this.health < 1) {
            this.health = 0;
            return true;
        } else {
            return false;
        }
    }
    /**
     * This method check is hero has enough mana and chance to do fatal damage and set damage which hero can do.
     *
     * @return damage of the hero.
     */
    protected int attackDamage() {
        if (isFatalDamage() && isEnoughMana()) {
            damage = this.weapon.getFatalDamage();
            this.mana -= damage;
        } else {
            damage = this.weapon.getDamage();
        }
        return damage;
    }

    /**
     * Set random if hero can do fatal damage.
     *
     * @return boolean type.
     */
    private boolean isFatalDamage() {
        return Math.random() < chanceOfFatalDamage;
    }

    /**
     * Check is enough mana to deal fatal damage.
     *
     * @return boolean - is enough mana
     */
    private boolean isEnoughMana() {
        return this.getWeapon().getFatalDamage() <= mana;
    }

    /**
     * Set health.
     *
     * @param health - the health og hero
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Get chance of fatal damage.
     *
     * @return the chance of fatal damage
     */
    public double getChanceOfFatalDamage() {
        return chanceOfFatalDamage;
    }

    /**
     * Set chance of fatal damage.
     *
     * @param chanceOfFatalDamage - hero's chance of fatal damage
     */
    protected void setChanceOfFatalDamage(double chanceOfFatalDamage) {
        this.chanceOfFatalDamage = chanceOfFatalDamage;
    }

    /**
     * Get weapon.
     *
     * @return the weapon of hero
     */
    protected Weapon getWeapon() {
        return weapon;
    }

    /**
     * Set weapon which hero use.
     *
     * @param weapon the weapon
     */
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Get name of weapon.
     *
     * @return the name of weapon
     */
    public abstract String getNameOfWeapon();

    @Override
    public abstract String toString();
}
