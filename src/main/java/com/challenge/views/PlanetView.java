package com.challenge.views;

import com.challenge.models.PlanetModel;

public class PlanetView implements IView {

    private static String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
            "\tName: %s\n\n",
            "\tDescription:\n",
            "\t%s",
            "\tRadius: %s km\tDistance from earth: %s million km\n",
            "\tTemperature Range (celsius):\n",
            "\t\tMin: %s\t\tMax: %s\n",
            "\tGravity: %s\t\tLength of day: %s\n",
            "Hospitable: %s\t\tKnown Moons: %s\n"
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

        return;
    }
}
