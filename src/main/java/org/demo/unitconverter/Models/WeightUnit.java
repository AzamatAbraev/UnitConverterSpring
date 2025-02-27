package org.demo.unitconverter.Models;

public enum WeightUnit {
    MILLIGRAM(0.001), GRAM(1.0), KILOGRAM(1000.0),
    OUNCE(28.3495), POUND(453.592);

    private final double toBaseUnitFactor;

    WeightUnit(double toBaseUnitFactor) {
        this.toBaseUnitFactor = toBaseUnitFactor;
    }

    public double toBaseUnit(double value) {
        return value * toBaseUnitFactor;
    }

    public double fromBaseUnit(double value) {
        return value / toBaseUnitFactor;
    }
}
