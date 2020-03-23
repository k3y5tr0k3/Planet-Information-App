package com.challenge.views;

public class MenuView implements IView {

    private static final String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
            "\tMain Menu:\n\n",
            "\t\t1. Planets\n",
            "\t\t2. About\n",
            "\t\t3. Help\n",
            "\t\t0. Exit\n"
    };

    public static void render() {
        String temp = String.join(" ", template);
        temp += NavigationControlView.render("menu");

        System.out.println(temp);

        return;
    }
}
