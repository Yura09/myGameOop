package com.epam.myGame.model.heroes.abstractHero;

import com.epam.myGame.model.features.Heal;
import com.epam.myGame.model.features.Health;
import com.epam.myGame.model.features.Mana;
import com.epam.myGame.model.weapon.Weapon;

import java.util.Random;

/**
 * The type Hero.
 */
public abstract class Hero implements Race, Heal, Health, Mana {
    private final Random random = new Random();
    private int health;
    private int mana;
    private int damage;
    private int numHealthPotions;
    private double chanceOfFatalDamage;
    private Weapon weapon;

    /**
     * Heal hp int.
     *
     * @return the int
     */
    protected int healHp() {
        int healHp = random.nextInt(Heal.MAX_HEAL - Heal.MIN_HEAL) + MIN_HEAL;
        --numHealthPotions;
        this.health += healHp;
        return this.health;
    }

    /**
     * Gets num health potions.
     *
     * @return the num health potions
     */
    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    /**
     * Sets num health potions.
     *
     * @param numHealthPotions the num health potions
     */
    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }

    /**
     * Gets health.
     *
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Instantiates a new Hero.
     */
    public Hero() {
        this.health = random.nextInt(MAX_HEALTH - MIN_HEALTH) + MIN_HEALTH;
        this.mana = random.nextInt(MAX_MANA - MIN_MANA) + MIN_MANA;
        numHealthPotions = NUM_HEALTH_POTIONS;
    }

    /**
     * Is dead boolean.
     *
     * @return the boolean
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
     * Attack damage int.
     *
     * @return the int
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

    private boolean isFatalDamage() {
        return Math.random() < chanceOfFatalDamage;
    }

    private boolean isEnoughMana() {
        return damage <= mana;
    }

    /**
     * Sets health.
     *
     * @param health the health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets chance of fatal damage.
     *
     * @return the chance of fatal damage
     */
    public double getChanceOfFatalDamage() {
        return chanceOfFatalDamage;
    }

    /**
     * Sets chance of fatal damage.
     *
     * @param chanceOfFatalDamage the chance of fatal damage
     */
    protected void setChanceOfFatalDamage(double chanceOfFatalDamage) {
        this.chanceOfFatalDamage = chanceOfFatalDamage;
    }

    /**
     * Gets weapon.
     *
     * @return the weapon
     */
    protected Weapon getWeapon() {
        return weapon;
    }

    /**
     * Sets weapon.
     *
     * @param weapon the weapon
     */
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Gets name of weapon.
     *
     * @return the name of weapon
     */
    public abstract String getNameOfWeapon();

    @Override
    public abstract String toString();
}
