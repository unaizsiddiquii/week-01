import java.util.Random;
import java.util.Scanner;


public class VotingEligibility {

    // Method to generate random 2-digit ages
    public static int[] generateRandomAges(int n) {
        if (n <= 0) {
            return new int[]{};
        }

        int[] ages = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;
        }

        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                results[i][1] = "true";  // Can vote
            } else {
                results[i][1] = "false"; // Cannot vote
            }
        }

        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tCan Vote");
        System.out.println("-----------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 10;
        int[] ages = new int[numberOfStudents];

        // Taking user input for ages
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Alternatively, use random ages:
        // int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(ages);

        // Display results
        displayResults(eligibilityResults);

        scanner.close();
    }
}
