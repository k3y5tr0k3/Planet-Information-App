package com.challenge.controllers;

import com.challenge.models.MoonModel;
import com.challenge.models.PlanetModel;
import com.challenge.utils.DatabaseService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlanetController {

    public static ArrayList<PlanetModel> getPlanets() {

        String query = "Select * FROM planets";

        DatabaseService dataService = new DatabaseService();
        ResultSet results = dataService.select(query);

        return objectify(results);
    }

    private static ArrayList<PlanetModel> objectify(ResultSet results) {
        ArrayList<PlanetModel> moons = new ArrayList<>();
        try {
            while (results.next()){
                PlanetModel moon = new PlanetModel(
                        results.getInt(         "planet_id"),
                        results.getString(      "name"),
                        results.getString(      "description"),
                        results.getInt(         "radius"),
                        results.getInt(         "temperature_min"),
                        results.getInt(         "temperature_max"),
                        results.getInt(         "force_of_gravity"),
                        results.getInt(         "distance_from_earth"),
                        results.getBoolean(     "isHospitable"),
                        results.getInt(         "length_of_day"),
                        results.getInt(         "number_of_moons")
                );
                moons.add(moon);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return moons;
    }
}
