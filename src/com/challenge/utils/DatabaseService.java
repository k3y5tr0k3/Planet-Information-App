package com.challenge.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.FileSystems;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

    @Nullable
    private Connection create() {
        String projectDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        String url = "jdbc:sqlite:" + projectDir + "/planets.sqlite";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                return conn;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private void destroy(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ResultSet select(String query) {

        Connection conn = this.create();

        try {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                return stmt.executeQuery(query);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            destroy(conn);
        }

        return null;
    }

}
