package org.demo.unitconverter.Models;

public enum TemperatureUnit {
    CELSIUS, FAHRENHEIT, KELVIN;

    public static double convert(double value, TemperatureUnit from, TemperatureUnit to) {
        if (from == to) return value; // No conversion needed

        switch (from) {
            case CELSIUS -> {
                if (to == FAHRENHEIT) return value * 9/5 + 32;
                if (to == KELVIN) return value + 273.15;
            }
            case FAHRENHEIT -> {
                if (to == CELSIUS) return (value - 32) * 5/9;
                if (to == KELVIN) return (value - 32) * 5/9 + 273.15;  // ✅ Fixed conversion
            }
            case KELVIN -> {
                if (to == CELSIUS) return value - 273.15;
                if (to == FAHRENHEIT) return (value - 273.15) * 9/5 + 32;
            }
        }
        throw new IllegalArgumentException("Invalid temperature conversion");
    }
}
