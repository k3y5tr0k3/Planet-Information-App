package com.challenge.views;

import com.challenge.models.PlanetModel;

public class PlanetView {

    private static String[] template = {
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n****************************  Planet Info App  ****************************\n\n\n",
            "\tName: %s\n\n",
            "\tDescription:\n",
            "\t%s\n",
            "\tRadius: %s km\n",
            "\tDistance from earth: %s million km\n",
            "\tTemperature Range (celsius):\n",
            "\t\tMin: %s\t\tMax: %s\n",
            "\tGravity: %s\n",
            "\tLength of day: %s\n",
            "\tHospitable: %s\n",
            "\tKnown Moons: %s\n"
    };

    public static void render(PlanetModel planet) {
        String[] info = new String[] {
                planet.getName(),
                planet.getDescription(),
                planet.getRadius() + "",
                planet.getDistanceFromEarth() + "",
                planet.getTemperatureRange()[0] + "",
                planet.getTemperatureRange()[1] + "",
                planet.getForceOfGravity() + "",
                planet.getLenghtOfDay() + "",
                planet.getIsHospitable() + "",
                planet.getNumberOfMoons() + ""
        };

        String temp = String.join(" ", template);
        temp += NavigationControlView.render("planet");

        System.out.printf(temp, info);
    }
}
