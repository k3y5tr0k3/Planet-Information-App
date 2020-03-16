package com.challenge;

import com.challenge.utils.DatabaseConnection;

import java.nio.file.FileSystems;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        String projectDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        System.out.println(projectDir);

        Connection conn = DatabaseConnection.getConnection();


        // TODO: Configuration

        // TODO: Display Menu
    }
}
