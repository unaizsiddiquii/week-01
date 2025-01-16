import java.util.Scanner;

public class PalindromeChecker {

    // Method 1: Iterative approach to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method 2: Recursive approach to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if start index is greater than or equal to end index
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call to check the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method 3: Using character arrays to check palindrome
    public static boolean isPalindromeUsingArray(String text) {
        // Convert string to character array
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        // Reverse the character array
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false; // Characters don't match
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text to check if it's a palindrome: ");
        String text = scanner.nextLine().toLowerCase().replaceAll("\\s+", ""); // Convert to lowercase and remove spaces

        // Check palindrome using all three methods
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean arrayResult = isPalindromeUsingArray(text);

        // Display results
        System.out.println("Using Iteration: " + (iterativeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursion: " + (recursiveResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Character Arrays: " + (arrayResult ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
