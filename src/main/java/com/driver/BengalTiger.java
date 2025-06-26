package com.driver;

public class BengalTiger implements Tiger {
    private String color;
    private double averageWeight;
    private String preferredClimate;

    public BengalTiger(String color, double averageWeight, String preferredClimate) {
        this.color = color;
        this.averageWeight = averageWeight;
        this.preferredClimate = preferredClimate;
    }

    
    @Override
    public String getType() {
        return "Bengal Tiger";
    }

    @Override
    public String getColor() {
        return "Orange with black stripes";
    }

    @Override
    public double getAverageWeight() {
        return 220.0;
    }

    @Override
    public String getPreferredClimate() {
        return "Subtropical";
    }
}

