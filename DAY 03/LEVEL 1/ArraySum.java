import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Define an array to store up to 10 elements and variables for the total and index
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            // Break the loop if the number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Break the loop if the array is full
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = num;
            index++;
        }

        // Calculate the total and display the numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // Display the total value
        System.out.println("\nTotal of all numbers: " + total);

        input.close();
    }
}
