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

    protected void configure(ArrayList<PlanetModel> planets) {
        this.planets = planets;

        LoggingService.log(this.getClass(), ": Configured");
    }

    public void start() {
        mainMenuView();
    }

    private void mainMenuView() {
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
        // lazy loaded moons
        ArrayList<MoonModel> tempMoons = null;
        tempMoons = MoonController.getMoons(planet);
        System.out.println(tempMoons.isEmpty());

        PlanetView.render(planet);

        Integer[] options = new Integer[] {0, 1, 2};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        switch (result) {
            case 0:
                mainMenuView();
                break;

            case 1:
                planetMenuView(planets);
                break;

            case 2:
                if (planet.getNumberOfMoons() > 0) {
                    moonView(tempMoons);
                }
                break;
        }
    }

    private void planetMenuView(ArrayList<PlanetModel> planets) {
        PlanetMenuView.render(planets);

        Integer[] options = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int result = getInput(
                new ArrayList<Integer>(Arrays.asList(options))
        );

        if (result == 0) {
            mainMenuView();
        }

        for (PlanetModel planet : planets) {
            if (planet.getId() == result) {
                currentPlanet = planet;
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
        HelpView.render();

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
}
