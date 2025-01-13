import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter the distance in yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter the distance in inches: ");
        double inches = sc.nextDouble();

        // Conversion results
        System.out.println("Distance in miles: " + convertKmToMiles(km));
        System.out.println("Distance in meters: " + convertFeetToMeters(feet));
        System.out.println("Distance in feet: " + convertMetersToFeet(meters));
        System.out.println("Distance in feet (from yards): " + convertYardsToFeet(yards));
        System.out.println("Distance in yards: " + convertFeetToYards(feet));
        System.out.println("Distance in inches: " + convertMetersToInches(meters));
        System.out.println("Distance in meters (from inches): " + convertInchesToMeters(inches));
        System.out.println("Distance in centimeters: " + convertInchesToCentimeters(inches));

        sc.close();
    }
}
