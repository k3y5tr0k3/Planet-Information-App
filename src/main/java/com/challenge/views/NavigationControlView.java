package com.challenge.views;

public class NavigationControlView {

    private static String[] mainMenuTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t\n",
            "____________________________________________________________________________",
            "\n\n\n\n\n\n\n\n" +
                    ""
    };

    private static String[] menuTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t[0] MainMenu\n",
            "____________________________________________________________________________",
            "\n\n\n\n\n\n\n\n"
    };

    private static String[] planetTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t[0] MainMenu\t\t[1] Back\t\t[2] View Moons\n",
            "____________________________________________________________________________",
            "\n\n\n\n\n\n\n\n"
    };

    private static String[] moonTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\t[0] MainMenu\t[1] Back\t[2] Prev\t[3] Next\n",
            "____________________________________________________________________________",
            "\n\n\n\n\n\n\n\n"
    };

    protected static String render(String template) {
        String[] choice = new String[3];

        switch (template) {
            case "main":
                choice = mainMenuTemplate;
                break;
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
