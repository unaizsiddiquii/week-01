import java.util.Scanner;

public class BMICalculator2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");

            // Input height
            do {
                System.out.print("Height (in meters, positive value): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Input weight
            do {
                System.out.print("Weight (in kilograms, positive value): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Height(m)  Weight(kg)  BMI        Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][0] + "         " + personData[i][1] + "        " + personData[i][2] + "        " + weightStatus[i]);
        }

        input.close();
    }
}
