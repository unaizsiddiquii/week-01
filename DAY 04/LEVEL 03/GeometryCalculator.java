import java.util.Scanner;

public class GeometryCalculator {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope and y-intercept of the line passing through two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope;
        double yIntercept;

        // Check if the line is vertical
        if (x1 == x2) {
            throw new IllegalArgumentException("The line is vertical; slope is undefined.");
        }

        // Calculate slope
        slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept
        yIntercept = y1 - slope * x1;

        // Return an array containing the slope and y-intercept
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates of the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the points is: %.2f%n", distance);

        try {
            // Calculate and display the equation of the line
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            double slope = lineEquation[0];
            double yIntercept = lineEquation[1];
            System.out.printf("The equation of the line is: y = %.2fx + %.2f%n", slope, yIntercept);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
