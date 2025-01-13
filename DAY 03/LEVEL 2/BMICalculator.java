import java.util.Scanner;

public class BMICalculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // user input for the number of persons
    System.out.print("Enter the number of persons: ");
    int numberOfPersons = input.nextInt();

    // Arrays to store height, weight, BMI, and weight status
    double[] heights = new double[numberOfPersons];
    double[] weights = new double[numberOfPersons];
    double[] bmis = new double[numberOfPersons];
    String[] statuses = new String[numberOfPersons];

    // Input weight and height for each person
    for (int i = 0; i < numberOfPersons; i++) {
      System.out.println("\nEnter details for person " + (i + 1) + ":");
      System.out.print("Height (in meters): ");
      heights[i] = input.nextDouble();
      System.out.print("Weight (in kilograms): ");
      weights[i] = input.nextDouble();

      // Calculate BMI
      bmis[i] = weights[i] / (heights[i] * heights[i]);

      // Determine weight status
      if (bmis[i] < 18.5) {
        statuses[i] = "Underweight";
      } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
        statuses[i] = "Normal weight";
      } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
        statuses[i] = "Overweight";
      } else {
        statuses[i] = "Obese";
      }
    }

    // Display the results
    System.out.println("\nResults:");
    System.out.println("Height(m)  Weight(kg)  BMI        Weight Status");
    for (int i = 0; i < numberOfPersons; i++) {
      System.out.println(heights[i] + "         " + weights[i] + "        " + bmis[i] + "        " + statuses[i]);
    }

    input.close();
  }
}
