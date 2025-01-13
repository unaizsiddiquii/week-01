import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the input is a positive integer
        if (number > 0) {
            // Create a String array to store the results
            String[] results = new String[number + 1];  // Including 0

            // Loop from 0 to the given number
            for (int i = 0; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    results[i] = "FizzBuzz";
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0 && i != 0) {
                    results[i] = "Fizz";
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0 && i != 0) {
                    results[i] = "Buzz";
                }
                // If it's not divisible by 3 or 5, store the number itself
                else {
                    results[i] = Integer.toString(i);
                }
            }

            // Loop through the results array and print each position and value
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + (i) + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        input.close();
    }
}
