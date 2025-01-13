import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights = new double[10];
        double[] heights = new double[10];
        double[] bmis = new double[10];
        String[] statuses = new String[10];

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            bmis[i] = calculateBMI(weights[i], heights[i]);
            statuses[i] = getBMIStatus(bmis[i]);
        }

        // Display results
        System.out.printf("%n%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weights[i], heights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }
}
