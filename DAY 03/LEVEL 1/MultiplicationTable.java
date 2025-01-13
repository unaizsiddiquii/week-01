import java.util.Scanner;

public class MultiplicationTable  {
    public static void main(String[] args) {
        // Get the number input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();

        // Define an integer array to store the results of multiplication from 1 to 10
        int[] table = new int[10];

        // Run a loop from 1 to 10 and store the results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the results from the array
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
