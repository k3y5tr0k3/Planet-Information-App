package com.challenge;

import java.nio.file.FileSystems;

public class Main {

    public static void main(String[] args) {

        String projectDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        System.out.println("Hello World!");

        // TODO: Configuration

        // TODO: Display Menu
    }
}
