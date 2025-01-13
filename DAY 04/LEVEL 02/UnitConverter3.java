import java.util.Scanner;

public class UnitConverter3 {

    // Met statichod to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Met statichod to convert Fahrenheit to Celsius and return the value
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Met statichod to convert Celsius to Fahrenheit and return the value
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Met statichod to convert pounds to kilograms and return the value
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Met statichod to convert kilograms to pounds and return the value
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Met statichod to convert gallons to liters and return the value
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Met statichod to convert liters to gallons and return the value
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        // Convert and display kilometers to miles
        double miles = convertKmToMiles(km);
        System.out.println("Distance in miles: " + miles);

        // Take input for Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: "); 
        double fahrenheit = sc.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);

        // Take input for Celsius
        System.out.print("Enter the temperature in Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Take input for pounds
        System.out.print("Enter the weight in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println("Weight in kilograms: " + kilograms);

        // Take input for kilograms
        System.out.print("Enter the weight in kilograms: ");
        kilograms = sc.nextDouble();
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println("Weight in pounds: " + pounds);

        // Take input for gallons
        System.out.print("Enter the volume in gallons: ");
        double gallons = sc.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println("Volume in liters: " + liters);

        // Take input for liters
        System.out.print("Enter the volume in liters: ");
        liters = sc.nextDouble();
        gallons = convertLitersToGallons(liters);
        System.out.println("Volume in gallons: " + gallons);

        sc.close();
    }
}
