package com.challenge.controllers;

import com.challenge.models.PlanetModel;
import com.challenge.utils.DatabaseService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlanetController {

    private final static String query = "Select * FROM planets;";

//    public static ArrayList<PlanetModel> getPlanets() {
//        DatabaseService dataService = new DatabaseService();
//        //ResultSet results = dataService.select(query);
//        //System.out.println(results);
//        //ArrayList<PlanetModel> planets = objectify(results);
//        dataService.destroy();
//        return planets;
//    }

    private static ArrayList<PlanetModel> objectify(ResultSet results) {
        ArrayList<PlanetModel> planets = new ArrayList();
        try {
            System.out.printf(results.toString());
            while (results.next()){
                PlanetModel planet = new PlanetModel(
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
                System.out.println(planet.getName());
                planets.add(planet);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return planets;
    }
}
