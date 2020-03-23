package com.challenge.services;

import com.challenge.controllers.MoonController;
import com.challenge.models.MoonModel;
import com.challenge.models.PlanetModel;
import com.challenge.views.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NavigationService {

    private ArrayList<PlanetModel> planets;
    private PlanetModel currentPlanet;
    // lazy loaded moons
    private ArrayList<MoonModel> tempMoons;

    protected void configure(ArrayList<PlanetModel> planets) {
        this.planets = planets;

        LoggingService.log(this.getClass(), ": Configured");
    }

    public void start() {
        mainMenuView();
    }

    private void mainMenuView() {
        clearScreen();

        MenuView.render();

        Integer[] options = new Integer[] {0, 1, 2, 3};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        switch (result) {
            case 0:
                System.exit(0);
                break;
            case 1:
                planetMenuView(planets);
                break;
            case 2:
                viewAbout();
                break;
            case 3:
                helpView();
                break;
        }
    }

    private void planetView(PlanetModel planet) {
        clearScreen();

        tempMoons = null;
        tempMoons = MoonController.getMoons(planet);

        PlanetView.render(planet);

        Integer[] options = new Integer[] {0, 1};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        switch (result) {
            case 0:
                mainMenuView();
                break;
            case 1:
                if (planet.getNumberOfMoons() > 0) {
                    moonView(tempMoons);
                }
                break;
        }
    }

    private void planetMenuView(ArrayList<PlanetModel> planets) {
        clearScreen();

        PlanetMenuView.render(planets);

        Integer[] options = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        for (PlanetModel planet : planets) {
            if (planet.getId() == result) {
                planetView(planet);
            }
        }
    }

    private void moonView(ArrayList<MoonModel> moons) {
        int index = 0;
        Integer[] options = new Integer[] {0, 1, 2, 3};

        while (true) {
            MoonView.render(moons.get(index));
            int result = getInput(
                    new ArrayList<Integer>(Arrays.asList(options))
            );

            switch (result) {
                case 0:
                    mainMenuView();
                    break;

                case 1:
                    planetView(currentPlanet);
                    break;

                case 2:
                    if (index > 0) {
                        --index;
                    } else if (index == 0) {
                        index = moons.size()-1;
                    }
                    break;

                case 3:
                    if (index < moons.size()-1) {
                        ++index;
                    } else if (index == moons.size()-1) {
                        index = 0;
                    }
                    break;
            }
        }
    }

    private void viewAbout() {
        AboutView.render();

        Integer[] options = new Integer[] {0};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        mainMenuView();
    }

    private void helpView() {
        clearScreen();

        Integer[] options = new Integer[] {0};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        mainMenuView();
    }

    private int getInput(ArrayList<Integer> options) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int choice = sc.nextInt();
            if (options.contains(choice)) {
                return choice;
            }
        }
    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
            LoggingService.log(ex.getMessage());
        }
    }
}
