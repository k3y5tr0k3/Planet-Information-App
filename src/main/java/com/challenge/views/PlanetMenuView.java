package com.challenge.views;

import com.challenge.models.PlanetModel;

import java.util.ArrayList;

public class PlanetMenuView {

    private static String[] template = {
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n****************************  Planet Info App  ****************************\n\n\n",
            "\tPlanets:\n\n",
            "%s"
    };

    public static void render(ArrayList<PlanetModel> planets) {
        String temp = String.join(" ", template);
        StringBuilder menu = new StringBuilder();

        for (PlanetModel planet : planets) {
            menu.append("\t\t[")
                    .append(planet.getId())
                    .append("] ")
                    .append(planet.getName())
                    .append("\n");
        }

        temp += NavigationControlView.render("menu");

        System.out.printf(temp, menu.toString());
    }
}
