package com.challenge.views;

public class NavigationControlView implements IView {

    private static String[] menuTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\tEsc = MainMenu\n",
            "____________________________________________________________________________\n"
    };

    private static String[] planetTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\tESC = MainMenu\t\t\tENTER = View Moons\n",
            "____________________________________________________________________________\n"
    };

    private static String[] moonTemplate = {
            "\n____________________________________________________________________________\n\n",
            "\tESC = MainMenu\t\tLEFT_ARROW = prev\tRIGHT_ARROW = next\n",
            "____________________________________________________________________________\n"
    };

    public static String render(String template) {
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

        return String.join(" ", template);
    }
}
