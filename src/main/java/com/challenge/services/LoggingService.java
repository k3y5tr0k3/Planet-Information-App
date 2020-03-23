package com.challenge.services;

import com.challenge.utils.ProjectDirectory;

import java.io.IOException;
import java.util.logging.*;

public class LoggingService {

    private static final Logger logger = Logger.getLogger("PlanetAppLogger");

    public static void configure(String logFile) {
        LogManager.getLogManager().reset();
        logger.setLevel(Level.ALL);
        logFile = ProjectDirectory.get().concat(logFile);

        try {
            FileHandler fileHandler = new FileHandler(logFile);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.ALL);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("Logging configured!");
    }

    public static void log(Object caller, String message) {
        logger.log(Level.ALL, message, caller);
    }

    public static void log(String message) {
        logger.info(message);
    }
}
