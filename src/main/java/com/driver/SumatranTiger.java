package com.driver;

public class SumatranTiger implements Tiger {
    @Override
      private String color;
    private double averageWeight;
    private String preferredClimate;

    public SumatranTiger(String color, double averageWeight, String preferredClimate) {
        this.color = color;
        this.averageWeight = averageWeight;
        this.preferredClimate = preferredClimate;
    }
    public String getType() {
        return "Sumatran Tiger";
    }

    @Override
    public String getColor() {
        return "Orange with thinner black stripes";
    }

    @Override
    public double getAverageWeight() {
        return 140.0;
    }

    @Override
    public String getPreferredClimate() {
        return "Tropical";
    }
}

