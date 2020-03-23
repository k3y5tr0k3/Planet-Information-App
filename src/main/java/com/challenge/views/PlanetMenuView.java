package com.challenge.views;

import com.challenge.models.PlanetModel;

import java.util.ArrayList;

public class PlanetMenuView implements IView {

    private static String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
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

        System.out.printf(temp, menu.toString());

        return;
    }
}
