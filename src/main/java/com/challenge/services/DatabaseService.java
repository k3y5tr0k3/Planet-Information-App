package com.challenge.services;

import com.challenge.utils.ProjectDirectory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseService {

    public static String connectionString;
    public Connection currentConnection;

    protected static void configure(String dbName) {
        connectionString =  "jdbc:sqlite:"  + ProjectDirectory.get() + dbName;
    }

    public Connection create() {
        try {
            Connection conn = DriverManager.getConnection(connectionString);
            if (conn != null) {
                currentConnection = conn;
                return conn;
            }
        } catch (SQLException e) {
            LoggingService.log(e.toString());
        }

        return null;
    }

    public void destroy() {
        try {
            if (currentConnection != null) {
                currentConnection.close();
                currentConnection = null;
            }
        } catch (SQLException e) {
            LoggingService.log(e.toString());
        }
    }

    public ResultSet select(String query) {
        final Connection conn = this.create();

        try {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                return stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            LoggingService.log(e.toString());
        }

        return null;
    }
}
