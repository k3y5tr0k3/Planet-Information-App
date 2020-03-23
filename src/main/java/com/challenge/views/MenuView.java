package com.challenge.views;

public class MenuView {

    private static final String[] mainMenuPage = {
            "1. Browse",
            "2. Facts",
            "3. About",
            "4. Help",
            "5. Exit"
    };

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
