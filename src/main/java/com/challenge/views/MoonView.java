package com.challenge.views;

import com.challenge.models.MoonModel;

public class MoonView implements IView {

    private static String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
            "\tName: %s\n\n",
            "\tDescription:\n",
            "\t\t%s\n",
            "\tRadius: %s km\tDistance from host: %s km\n",
            "\tGravity: %s\n\n\n\n"
    };

    public static void render(MoonModel moon) {
        String[] info = new String[] {
                moon.getName(),
                moon.getDescription(),
                moon.getRadius() + "",
                moon.getDistanceFromHostPlanet() + "",
                moon.getForceOfGravity() + "",
        };

        String temp = String.join(" ", template);
        temp += NavigationControlView.render("moon");

        System.out.printf(temp, info);

        return;
    }
}
