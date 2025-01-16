import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and determine status
    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4]; // Array to store height, weight, BMI, and status
        
        for (int i = 0; i < 10; i++) {
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            double bmi = data[i][0] / (heightInMeters * heightInMeters); // BMI formula
            String status = getStatus(bmi);
            
            // Store height, weight, BMI, and status in result array
            result[i][0] = String.format("%.2f", data[i][1]);
            result[i][1] = String.format("%.2f", data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        
        return result;
    }

    // Method to determine BMI status
    static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 40) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the result in tabular format
    static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // Array to store weight and height

        // Taking input for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] result = calculateBMI(data);

        // Display the result
        displayResult(result);
    }
}