import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // [students][PCM]
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 41) + 60; // Random scores between 60 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // [students][total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("S.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int) results[i][0] + "\t"); // Total
            System.out.print(results[i][1] + "\t"); // Average
            System.out.print(results[i][2] + "%\n"); // Percentage
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate scores
        int[][] scores = generateScores(numStudents);

        // Calculate results
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScoreCard(scores, results);

        scanner.close();
    }
}
