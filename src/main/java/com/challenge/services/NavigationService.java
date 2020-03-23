package com.challenge.services;

import com.challenge.views.Page;

public class NavigationService {

    public static void display(Page page) {

        switch(page) {
            case MENU:
                displayMainMenu();
                break;
            case PLANETS:
                displayPlanetMenu();
                break;
            case MOONS:
                displayMoonMenu();
                break;
            case ABOUT:
                displayAbout();
                break;
            case HELP:
                displayHelp();
                break;
        }
    }

    private static void displayMainMenu() {

    }

    private static void displayMoonMenu() {

    }

    private static void displayPlanetMenu() {

    }

    private static void displayHelp() {

    }

    private static void displayAbout() {

    }
}
