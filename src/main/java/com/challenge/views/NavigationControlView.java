package com.challenge.views;

public class NavigationControlView implements IView {

    private static String[] menuTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t[0] MainMenu\n",
            "____________________________________________________________________________\n"
    };

    private static String[] planetTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t[0] MainMenu\t\t\t[1] View Moons\n",
            "____________________________________________________________________________\n"
    };

    private static String[] moonTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t[0] MainMenu\t\t[1] Prev\t[2] Next\n",
            "____________________________________________________________________________\n"
    };

    protected static String render(String template) {
        String[] choice = new String[3];

        switch (template) {
            case "menu":
                choice = menuTemplate;
                break;
            case "planet":
                choice = planetTemplate;
                break;
            case "moon":
                choice = moonTemplate;
                break;
        }

        return String.join(" ", choice);
    }
}
