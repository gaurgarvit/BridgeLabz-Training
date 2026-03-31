import java.util.*;
public class UnitConverter {

    // method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        // 1 kilometer = 0.621371 miles
        double km2miles= 0.621371;
        return km* km2miles;
    }

    // method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        // 1 mile = 1.60934 kilometers
        double miles2km= 1.60934;
        return miles* miles2km;
    }

    // method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        // 1 meter = 3.28084 feet
        double meters2feet= 3.28084;
        return meters * meters2feet;
    }

    // method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        // 1 foot = 0.3048 meters
        double feet2meters= 0.3048;
        return feet* feet2meters;
    }

    // method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet= 3;
        return yards* yards2feet;
    }

    // method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // 1 foot = 0.333333 yards
        double feet2yards= 0.333333;
        return feet* feet2yards;
    }

    // method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // 1 meter = 39.3701 inches
        double meters2inches= 39.3701;
        return meters* meters2inches;
    }

    // method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // 1 inch = 0.0254 meters
        double inches2meters= 0.0254;
        return inches * inches2meters;
    }

    // method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        // 1 inch = 2.54 centimeters
        double inches2cm= 2.54;
        return inches * inches2cm;
    }

    // method to convert fahrenheit to celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        // formula: (F - 32) * 5/9
        double farhenheit2celsius= (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // method to convert celsius to fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        // formula: (C * 9/5) + 32
        double celsius2farhenheit= (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // 1 pound = 0.453592 kilograms
        double pounds2kilograms= 0.453592;
        return pounds * pounds2kilograms;
    }

    // method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // 1 kilogram = 2.20462 pounds
        double kilograms2pounds= 2.20462;
        return kilograms * kilograms2pounds;
    }

    // method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        // 1 gallon = 3.78541 liters
        double gallons2liters= 3.78541;
        return gallons * gallons2liters;
    }

    // method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        // 1 liter = 0.264172 gallons
        double liters2gallons= 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking value as input
        System.out.print("Enter value to convert (test): ");
        double value= s.nextDouble();
        
        System.out.println("Converted value: "+ convertKmToMiles(value));
    }
}