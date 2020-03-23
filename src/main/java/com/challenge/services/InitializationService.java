package com.challenge.services;

import com.challenge.utils.ProjectDirectory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InitializationService {

    private final static String propFile = ProjectDirectory.get() + "/config/app.properties";

    public static void initialize() {
        LoggingService.configure(getProperty("log_file"));
        DatabaseService.configure(getProperty("connection_string"));


    }

    public static String getProperty(String property) {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(propFile));
            return props.getProperty(property);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
