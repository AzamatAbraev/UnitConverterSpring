package org.demo.unitconverter.Service;

import org.demo.unitconverter.Models.LengthUnit;
import org.demo.unitconverter.Models.TemperatureUnit;
import org.demo.unitconverter.Models.WeightUnit;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {
    public double convertLength(double value, LengthUnit from, LengthUnit to) {
        double meters = from.toBaseUnit(value);
        return to.fromBaseUnit(meters);
    }

    public double convertWeight(double value, WeightUnit from, WeightUnit to) {
        double gram = from.toBaseUnit(value);
        return to.fromBaseUnit(gram);
    }

    public double convertTemperature(double value, TemperatureUnit from, TemperatureUnit to) {
        return TemperatureUnit.convert(value, from, to);
    }
}
