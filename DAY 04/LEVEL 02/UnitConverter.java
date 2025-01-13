import java.util.Scanner;

// Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
// Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
// Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;

public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }

    // Method To convert Feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
    // Convert km to miles
    double feet2meters = 0.3048;
    double meters = feet * feet2meters;

    // return the value
    return meters;
    }
    
    // Method To convert meters to Feet and return the value
    public static double convertMetersToFeet(double meters) {
        
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;

        // return the value
        return feet;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();

        // Call the method to convert km to miles
        double miles = convertKmToMiles(km);
        double meterResule = convertFeetToMeters(feet);
        double feetResult = convertMetersToFeet(meters);

        // Display value 
        System.out.println("Distance in miles: " + miles);
        System.out.println("Distance in meters: " + meterResule);
        System.out.println("Distance in feet: " + feetResult);

        // Calling the Method again to convert km to miles and display it
       

        // Close the Scanner object
        sc.close();
    }
}
