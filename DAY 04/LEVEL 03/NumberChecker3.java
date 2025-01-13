import java.util.Scanner;

public class NumberChecker3 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a Duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
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
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
