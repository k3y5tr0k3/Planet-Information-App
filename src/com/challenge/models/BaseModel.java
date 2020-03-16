package com.challenge.models;

public abstract class BaseModel {

    private String name;
    private String description;
    private int radius;
    private int[] temperatureRange;
    private int forceOfGravity;

    public BaseModel(String name, String description, int radius, int[] temperatureRange, int forceOfGravity) {
        this.name             = name;
        this.description      = description;
        this.radius           = radius;
        this.temperatureRange = temperatureRange;
        this.forceOfGravity   = forceOfGravity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setTemperatureRange(int min, int max) {
        this.temperatureRange    = new int[2];
        this.temperatureRange[0] = min;
        this.temperatureRange[1] = max;
    }

    public int[] getTemperatureRange() {
        return this.temperatureRange;
    }

    public void setForceOfGravity(int forceOfGravity) {
        this.forceOfGravity = forceOfGravity;
    }

    public int getForceOfGravity() {
        return this.forceOfGravity;
    }
}
