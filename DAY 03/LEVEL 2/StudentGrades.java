import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // arrays to store marks, percentages, and grades
        int[][] marks = new int[n][3]; // 3 subjects
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // input for marks and validate
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int totalMarks = 0;
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
                while (marks[i][j] < 0) {
                    System.out.print("Please enter a positive value: ");
                    marks[i][j] = input.nextInt();
                }

                totalMarks += marks[i][j];
            }

            //Calculate percentage for grade
            percentages[i] = (totalMarks / 3.0);
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // results
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

        input.close();
    }
}