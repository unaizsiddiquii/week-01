import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Avoid division by zero by checking if the points have the same x-coordinate
        if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) {
            return (x2 - x1) == (x3 - x2) && (x3 - x2) == (x3 - x1);
        }

        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        // Check if area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the slope formula? " + collinearSlope);

        // Check collinearity using area of triangle formula
        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the area formula? " + collinearArea);

        // Close scanner
        scanner.close();
    }
}
