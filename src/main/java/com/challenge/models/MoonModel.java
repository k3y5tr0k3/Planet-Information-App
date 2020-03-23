package com.challenge.models;

public class MoonModel extends ModelBase {

    private int distanceFromHostPlanet;

    public MoonModel(int id,
                     String name,
                     String description,
                     int radius,
                     int forceOfGravity,
                     int distanceFromHostPlanet) {
        super(id, name, description, radius, forceOfGravity);

        this.distanceFromHostPlanet = distanceFromHostPlanet;
    }

    public int getDistanceFromHostPlanet() {
        return distanceFromHostPlanet;
    }

    public void setDistanceFromHostPlanet(int distanceFromHostPlanet) {
        this.distanceFromHostPlanet = distanceFromHostPlanet;
    }
}
