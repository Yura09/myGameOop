package com.epam.myGame.view;

import com.epam.myGame.controller.Controller;
import com.epam.myGame.controller.ControllerImpl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * The type View.
 */
public class View {
    private Controller controller;
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static Scanner input = new Scanner(System.in);

    /**
     * Instantiates a new View.
     */
    public View() {
        controller = new ControllerImpl();
        menu = new LinkedHashMap<>();
        menu.put("1", " 1 - Attack");
        menu.put("2", " 2 - Heal yourself");
        menu.put("3", " 3 - Run!");
        menu.put("Q", "  Q - exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
    }

    private void outputMenu() {
        System.out.println("\n\tWhat would you like to do?");
        for (String str : menu.values()) {
            System.out.println("\t" + str);
        }
    }

    private void showDamage() {

        System.out.println("\t> You strike the " + controller.getMonster() + " for " + controller.damageDealt() + " damage.");
        if (!controller.isMonsterDead()) {
            System.out.println("\t> You received " + controller.damageReceived() + " in retaliation");
            if (controller.isHeroDead()) {
                System.out.println("\t> You have taken too much damage, you are too weak to go on");
                return;
            }
            showHP();
        }
    }

    private void endOfMenu() {

        System.out.println("---------------------------------------");
        System.out.println(" # " + controller.getMonster() + " was defeated! # ");
        System.out.println(" # You have " + controller.getHealthOfHero() + " HP left. #");
        System.out.println("-------------------------------");
        System.out.println("what would you like to do now?");
        System.out.println("1. continue fighting");
        System.out.println("2.  exit arena");

    }

    private void showMainMenu() {
        System.out.println("\t#" + controller.getMonster() + " appeard! #\n");
        showWeapon();
        showHP();
    }

    /* public void showMainMenu(Hero hero) {
         System.out.println("\t#" + hero + " appeard! #\n");
         showHP();
     }*/
    private void showHP() {
        System.out.println("\tYour HP " + controller.getHealthOfHero());//getHealth
        System.out.println("\t" + controller.getMonster() + "'s HP " + controller.getHealthOfMonster());
        //to do
    }

    private void showWeapon() {
        System.out.println("\tYour weapon: " + controller.getNameOfWeaponHero());
        System.out.println("\tMonster's weapon: " + controller.getNameOfWeaponMonster());
    }

    private void pressButton1() {
        showDamage();
    }

    private void pressButton2() {

        controller.heal();
        System.out.println("you now have " + controller.getHealthOfHero() + "HP.\n\t> You have "
                + controller.getNumHealthPotions() + " health potions left.");
    }

    private void pressButton3() {
        System.out.println("\tYou run away from the " + controller.getMonster() + "!");
        controller.generateMonster();
        showMainMenu();
    }

    /**
     * Show.
     */
    public void show() {
        System.out.println("\nWelcome to the Arena");
        String keyMenu;
        GAME:
        while (true) {

            showMainMenu();
            do {
                outputMenu();

                keyMenu = input.nextLine().toUpperCase();
                try {
                    methodsMenu.get(keyMenu).print();
                } catch (NullPointerException e) {
                    System.out.println("incorrect inputs try again");
                }
                if (controller.isMonsterDead()) {
                    endOfMenu();
                    keyMenu = input.nextLine();
                    if (keyMenu.equals("1")) {
                        System.out.println("you continue fighting");
                        controller.generateMonster();
                        continue GAME;
                    } else {
                        System.out.println("you exit arena! bye bye");
                        break;
                    }

                }
            } while (!keyMenu.equals("Q") && !controller.isHeroDead());

            System.out.println("THANKS FOR PLAYING");
            break;
        }
    }
}

