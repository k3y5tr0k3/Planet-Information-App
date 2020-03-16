package com.challenge.models;

public class PlanetModel extends BaseModel {

    private int distanceFromEarth;
    private boolean isHospitable;
    private int lenghtOfDay;
    private int numberOfMoons;

    public PlanetModel(String name,
                       String description,
                       int radius,
                       int[] temperatureRange,
                       int forceOfGravity,
                       int distanceFromEarth,
                       boolean isHospitable,
                       int lenghtOfDay,
                       int numberOfMoons) {

        super(name, description, radius, temperatureRange, forceOfGravity);

        this.distanceFromEarth  = distanceFromEarth;
        this.isHospitable       = isHospitable;
        this.lenghtOfDay        = lenghtOfDay;
        this.numberOfMoons      = numberOfMoons;
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
