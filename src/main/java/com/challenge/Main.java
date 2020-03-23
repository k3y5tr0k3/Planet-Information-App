package com.challenge;

import com.challenge.controllers.PlanetController;
import com.challenge.utils.DatabaseService;
import com.challenge.utils.InitializationService;
import com.challenge.utils.LoggingService;
import com.challenge.utils.ProjectDirectory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        final String query = "select * from planets;";

        InitializationService.initialize();

        try {

            DatabaseService ds = new DatabaseService();
            System.out.println(DatabaseService.connectionString);

            ResultSet rs = ds.select(query);
            System.out.println(rs.next());
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());

        }
    }
}
