package com.challenge.views;

public class AboutView implements IView {

    private static String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
            "\tDescription: \n",
            "\t\tA simple Java console application for viewing information about\n",
            "\t\tthe planets in our solar system\n\n\n",
            "\tAuthor: Bryan Donnelly\n\n\n"
    };

    public static void render() {
        String temp = String.join(" ", template);
        temp += NavigationControlView.render("menu");

        System.out.println(temp);

        return;
    }
}
