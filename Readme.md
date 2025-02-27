# Unit Converter Web App

## Overview
This is a simple web application that allows users to convert between different units of measurement. The app supports conversions for length, weight, and temperature. Users can input a value, select the units to convert from and to, and view the converted value instantly.

## Features
- Convert between different units of measurement.
- Separate pages for Length, Weight, and Temperature conversions.
- User-friendly interface to input values and select units.
- Instant display of the converted value upon form submission.
- No database required; all conversions are handled by the backend.

## Supported Units
### Length
- Millimeter (mm)
- Centimeter (cm)
- Meter (m)
- Kilometer (km)
- Inch (in)
- Foot (ft)
- Yard (yd)
- Mile (mi)

### Weight
- Milligram (mg)
- Gram (g)
- Kilogram (kg)
- Ounce (oz)
- Pound (lb)

### Temperature
- Celsius (°C)
- Fahrenheit (°F)
- Kelvin (K)

## How It Works
1. Users visit the homepage and choose the type of conversion (Length, Weight, or Temperature).
2. They input the value and select the units to convert from and to.
3. On form submission, the data is sent to the backend for processing.
4. The server calculates the converted value and returns it to the user.
5. The result is displayed on the same page.

## Technologies Used
- **Frontend**: HTML, CSS (for styling), Thymeleaf (for templating)
- **Backend**: Java, Spring Boot (for handling conversions)

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/unit-converter.git
   ```
2. Navigate to the project directory:
   ```sh
   cd unit-converter
   ```
3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```
4. Open your browser and go to:
   ```
   http://localhost:8080
   ```

## Future Enhancements
- Add more unit conversions (e.g., volume, area, speed, time).
- Implement an interactive UI with AJAX for real-time conversion.
- Improve styling for a more modern and responsive design.

