package com.challenge.services;

import com.challenge.models.MoonModel;
import com.challenge.models.PlanetModel;
import com.challenge.views.MenuView;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NavigationService {

    // Available planets to navigate
    private ArrayList<PlanetModel> planets;

    // moons belonging to the current planet
    private ArrayList<MoonModel> tempMoons;

    protected void configure(ArrayList<PlanetModel> planets) {
        this.planets = planets;
    }

    public void start() {}

    private void mainMenu() {
        MenuView.render();

        int result = getInput();

        switch (result) {
            case 0:
                System.exit(0);
                break;
            case 1:
                planetMenu(planets);
                break;
            case 2:
                viewAbout();
                break;
            case 3:

        }
    }

    private void viewPlanet(PlanetModel planet) {}

    private void planetMenu() {}

    private void viewMoon() {}

    private void viewAbout() {}

    private int getInput() {
        Scanner sc = new Scanner();
        return sc.nextInt();
    }
}
