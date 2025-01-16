import java.util.Random;

public class StudentGrades {

    // Method to generate random 2-digit scores for PCM for each student
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Math
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + random.nextInt(61); 
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        // Total, Average, Percentage
        double[][] results = new double[scores.length][3]; 

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }
        return results;
    }

    // Method to calculate grade based on the percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Scorecard:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Math", "Total",
                "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f %-10.2f %-10s%n",
                    scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; 

        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}