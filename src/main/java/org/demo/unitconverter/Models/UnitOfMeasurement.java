package org.demo.unitconverter.Models;

public class UnitOfMeasurement<T extends Enum<T>> {
    private final String unitName;
    private final T unitType;

    public UnitOfMeasurement(String unitName, T unitType) {
        this.unitName = unitName;
        this.unitType = unitType;
    }

    public String getUnitName() {
        return unitName;
    }

    public T getUnitType() {
        return unitType;
    }

    @Override
    public String toString() {
        return "UnitOfMeasurement{" +
                "unitName='" + unitName + '\'' +
                ", unitType=" + unitType +
                '}';
    }
}

