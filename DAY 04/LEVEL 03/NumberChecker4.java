import java.util.Scanner;

public class NumberChecker4 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number; // Check if sum of digits of the square is equal to the number itself
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product; // Check if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numberStr); // Check if square ends with the number itself
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // Check if divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Perform the operations and display the results
        System.out.println("Prime Number: " + isPrime(number));
        System.out.println("Neon Number: " + isNeonNumber(number));
        System.out.println("Spy Number: " + isSpyNumber(number));
        System.out.println("Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Buzz Number: " + isBuzzNumber(number));

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
