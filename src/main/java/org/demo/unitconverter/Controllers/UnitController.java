package org.demo.unitconverter.Controllers;

import org.demo.unitconverter.Models.LengthUnit;
import org.demo.unitconverter.Models.TemperatureUnit;
import org.demo.unitconverter.Models.UnitOfMeasurement;
import org.demo.unitconverter.Models.WeightUnit;
import org.demo.unitconverter.Service.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/unit")
public class UnitController {

    private final ConversionService conversionService;

    public UnitController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @ModelAttribute
    public void addUnitsToModel(Model model) {
        model.addAttribute("lengthUnits", LengthUnit.values());
        model.addAttribute("weightUnits", WeightUnit.values());
        model.addAttribute("temperatureUnits", TemperatureUnit.values());
    }

    @GetMapping("/length")
    public String showLength() {
        return "length";
    }

    @GetMapping("/weight")
    public String showWeight() {
        return "weight";
    }

    @GetMapping("/temperature")
    public String showTemperature() {
        return "temperature";
    }

    @PostMapping("/convertLength")
    public String convertLength(@RequestParam double lengthValue,
                                @RequestParam LengthUnit lengthUnitTo,
                                @RequestParam LengthUnit lengthUnitFrom,
                                Model model) {
         double convertedValue = conversionService.convertLength(lengthValue, lengthUnitFrom, lengthUnitTo);
         model.addAttribute("originalValue", lengthValue);
         model.addAttribute("convertedValue", convertedValue);
         model.addAttribute("originalUnit", lengthUnitFrom);
         model.addAttribute("convertedUnit", lengthUnitTo);
         return "length";
    }

    @PostMapping("/convertWeight")
    public String convertWeight(@RequestParam double weightValue,
                                @RequestParam WeightUnit weightUnitFrom,
                                @RequestParam WeightUnit weightUnitTo,
                                Model model) {
        double convertedValue = conversionService.convertWeight(weightValue, weightUnitFrom, weightUnitTo);
        model.addAttribute("originalValue", weightValue);
        model.addAttribute("convertedValue", convertedValue);
        model.addAttribute("originalUnit", weightUnitFrom);
        model.addAttribute("convertedUnit", weightUnitTo);
        return "weight";
    }

    @PostMapping("/convertTemperature")
    public String convertTemperature(@RequestParam double temperature,
                                @RequestParam TemperatureUnit temperatureUnitFrom,
                                @RequestParam TemperatureUnit temperatureUnitTo,
                                Model model) {
        double convertedValue = conversionService.convertTemperature(temperature, temperatureUnitFrom, temperatureUnitTo);
        model.addAttribute("originalValue", temperature);
        model.addAttribute("convertedValue", convertedValue);
        model.addAttribute("originalUnit", temperatureUnitFrom);
        model.addAttribute("convertedUnit", temperatureUnitTo);
        return "temperature";
    }
}
