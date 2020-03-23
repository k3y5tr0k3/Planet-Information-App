package com.challenge;

import com.challenge.controllers.MoonController;
import com.challenge.services.InitializationService;
import com.challenge.views.AboutView;

public class Main {

    public static void main(String[] args) {

        final String query = "select * from planets;";

        InitializationService.initialize();

        AboutView.render();
    }
}
