package com.epam.myGame.model.features;

/**
 * The interface Damage.
 */
public interface Damage {
    /**
     * The constant DAMAGE_SWORD.
     */
    int DAMAGE_SWORD = 25;
    /**
     * The constant DAMAGE_BOW.
     */
    int DAMAGE_BOW = 20;
    /**
     * The constant DAMAGE_STAFF.
     */
    int DAMAGE_STAFF = 15;
    /**
     * The constant FATAL_DAMAGE_BOW.
     */
    int FATAL_DAMAGE_BOW = 40;
    /**
     * The constant FATAL_DAMAGE_STAFF.
     */
    int FATAL_DAMAGE_STAFF = 40;
    /**
     * The constant FATAL_DAMAGE_SWORD.
     */
    int FATAL_DAMAGE_SWORD = 40;
    /**
     * The constant CHANCE_FATAL_BOW.
     */
    double CHANCE_FATAL_BOW = 0.4D;
    /**
     * The constant CHANCE_FATAL_SWORD.
     */
    double CHANCE_FATAL_SWORD = 0.35D;
    /**
     * The constant CHANCE_FATAL_STAFF.
     */
    double CHANCE_FATAL_STAFF = 0.45D;
}
