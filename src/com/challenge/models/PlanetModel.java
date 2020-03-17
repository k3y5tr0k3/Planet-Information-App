package com.challenge.models;

public class PlanetModel extends ModelBase {

    private int[] temperatureRange;
    private int distanceFromEarth;
    private boolean isHospitable;
    private int lenghtOfDay;
    private int numberOfMoons;

    public PlanetModel(int id,
                       String name,
                       String description,
                       int radius,
                       int temperatureMin,
                       int temperatureMax,
                       int forceOfGravity,
                       int distanceFromEarth,
                       boolean isHospitable,
                       int lenghtOfDay,
                       int numberOfMoons) {

        super(id, name, description, radius, forceOfGravity);

        this.setTemperatureRange(temperatureMin, temperatureMax);

        this.distanceFromEarth  = distanceFromEarth;
        this.isHospitable       = isHospitable;
        this.lenghtOfDay        = lenghtOfDay;
        this.numberOfMoons      = numberOfMoons;
    }

    public void setTemperatureRange(int min, int max) {
        this.temperatureRange    = new int[2];
        this.temperatureRange[0] = min;
        this.temperatureRange[1] = max;
    }

    public int[] getTemperatureRange() {
        return this.temperatureRange;
    }

    public void setDistanceFromEarth(int distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public int getDistanceFromEarth() {
        return this.distanceFromEarth;
    }

    public void setIsHospitable(boolean isHospitable) {
        this.isHospitable = isHospitable;
    }

    public boolean getIsHospitable() {
        return this.isHospitable;
    }

    public void setLenghtOfDay(int lenghtOfDay) {
        this.lenghtOfDay = lenghtOfDay;
    }

    public int getLenghtOfDay() {
        return this.lenghtOfDay;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfMoons() {
        return this.numberOfMoons;
    }
}
