package com.challenge.models;

public abstract class ModelBase {

    private int id;
    private String name;
    private String description;
    private int radius;
    private int forceOfGravity;

    public ModelBase(int id, String name, String description, int radius, int forceOfGravity) {
        this.id               = id;
        this.name             = name;
        this.description      = description;
        this.radius           = radius;
        this.forceOfGravity   = forceOfGravity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setForceOfGravity(int forceOfGravity) {
        this.forceOfGravity = forceOfGravity;
    }

    public int getForceOfGravity() {
        return this.forceOfGravity;
    }
}
