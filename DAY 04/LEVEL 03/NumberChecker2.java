import java.util.Scanner;

public class NumberChecker2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of the number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sum = sumOfDigits(digits);
        return originalNumber % sum == 0;
    }

    // Method to find the frequency of each digit in the number using a 2D array
    public static void digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9), each with a frequency column

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][0] = digit;  // Store the digit in the first column
            frequency[digit][1]++;        // Increment the frequency count in the second column
        }

        // Print the frequency of each digit
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "     | " + frequency[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store digits of the number
        int[] digits = storeDigits(number);

        // Perform the operations and display the results
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Harshad Number: " + isHarshadNumber(digits, number));
        digitFrequency(digits);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
