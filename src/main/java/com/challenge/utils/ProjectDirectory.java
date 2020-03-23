package com.challenge.utils;

import java.nio.file.FileSystems;

public class ProjectDirectory {

    private static final String projectDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();

    public static String get() {
        return projectDir;
    }
}
