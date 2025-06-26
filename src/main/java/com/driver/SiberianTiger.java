package com.driver;

public class SiberianTiger implements Tiger {
     private String color;
    private double averageWeight;
    private String preferredClimate;

    public SiberianTiger(String color, double averageWeight, String preferredClimate) {
        this.color = color;
        this.averageWeight = averageWeight;
        this.preferredClimate = preferredClimate;
    }

    @Override
    public String getType() {
        return "Siberian Tiger";
    }

    @Override
    public String getColor() {
        return "White with black stripes";
    }

    @Override
    public double getAverageWeight() {
        return 300.0;
    }

    @Override
    public String getPreferredClimate() {
        return "Cold";
    }
}
