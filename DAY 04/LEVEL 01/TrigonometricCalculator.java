import java.util.Scanner;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("For the angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);

        input.close();
    }
}
