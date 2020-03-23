package com.challenge.controllers;

import com.challenge.models.MoonModel;
import com.challenge.models.PlanetModel;
import com.challenge.services.DatabaseService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MoonController {

    private final static String baseQuery = "Select * FROM moons WHERE host_id = ";

    public static ArrayList<MoonModel> getMoons(PlanetModel planet) {
        final String query = baseQuery + planet.getId();

        DatabaseService dataService = new DatabaseService();
        ResultSet results = dataService.select(query);
        ArrayList moons = objectify(results);
        dataService.destroy();

        return moons;
    }

    private static ArrayList<MoonModel> objectify(ResultSet results) {
        ArrayList<MoonModel> moons = new ArrayList();
        try {
            while (results.next()){
                MoonModel moon = new MoonModel(
                        results.getInt(         "moon_id"),
                        results.getString(      "name"),
                        results.getString(      "description"),
                        results.getInt(         "radius"),
                        results.getInt(         "force_of_gravity"),
                        results.getInt(         "distance_from_host")
                );
                moons.add(moon);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return moons;
    }

}
