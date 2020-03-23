package com.challenge.views;

public class MenuView {

    private static final String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
            "\tMain Menu:\n\n",
            "\t\t[1] Planets\n",
            "\t\t[2] About\n",
            "\t\t[3] Help\n",
            "\t\t[0] Exit\n"
    };

    public static void render() {
        String temp = String.join(" ", template);
        temp += NavigationControlView.render("main");

        System.out.println(temp);
    }
}
