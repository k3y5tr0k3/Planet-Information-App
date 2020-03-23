package com.challenge.views;

public class AboutView {

    private static String[] template = {
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n****************************  Planet Info App  ****************************\n\n\n",
            "\tVersion: %s\n\n",
            "\tDescription: \n",
            "\t\tA simple Java console application for viewing information about\n",
            "\t\tthe planets in our solar system\n\n\n",
            "\tAuthor: Bryan Donnelly\n\n\n"
    };

    private static String appVersion;

    public static void configure(String version) {
        appVersion = version;
    }

    public static void render() {
        String temp = String.join(" ", template);
        temp += NavigationControlView.render("menu");

        System.out.printf(temp, appVersion);
    }
}
