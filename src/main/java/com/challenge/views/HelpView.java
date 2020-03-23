package com.challenge.views;

public class HelpView {

    private static String[] template = {
            "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n****************************  Planet Info App  ****************************\n\n\n",
            "\tTo navigate, choose to appropriate number and press enter\n\n\n\n\n\n\n\n\n\n"
    };

    public static void render() {
        String temp = String.join(" ", template);
        temp += NavigationControlView.render("menu");

        System.out.printf(temp);
    }
}
