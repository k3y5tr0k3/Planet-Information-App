package com.challenge.utils;

import java.nio.file.FileSystems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;

    private DatabaseConnection() {
        connect();
    }

    public static Connection getConnection() {
        if (connection == null) {
            new DatabaseConnection();
        }

        return connection;
    }

    private void connect() {
        String projectDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        String url = "jdbc:sqlite:" + projectDir + "/planets.sqlite";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                connection = conn;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
