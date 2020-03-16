package com.challenge.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private Connection connection;

    private DatabaseConnection(String filename) {
        connect(filename);
    }

    public void connect(String filename) {

        String projectDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        String url = "jdbc:sqlite:" + projectDir + "/db/" + filename;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                connection = conn;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
