import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        // Get the number input from the user
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // Define an array to store the multiplication results for 6 to 9
        int[] multiplicationResult = new int[4];

        // Using a for loop, calculate the multiplication results
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the results
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
