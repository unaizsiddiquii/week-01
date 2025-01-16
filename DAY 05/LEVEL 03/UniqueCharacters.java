import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string manually (without using length())
    public static int findStringLength(String text) {
        int length = 0;
        while (true) {
            try {
                // Try to access each character in the string
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                // End of string is reached
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int index = 0; // Index for the uniqueChars array

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the current character has already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false; // Mark as not unique if the character is found again
                    break;
                }
            }

            // If the character is unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[index++] = currentChar;
            }
        }

        // Create a new array of the exact size to store the unique characters
        char[] finalUniqueChars = new char[index];
        System.arraycopy(uniqueChars, 0, finalUniqueChars, 0, index);

        return finalUniqueChars;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        if (uniqueChars.length > 0) {
            System.out.print("Unique characters: ");
            for (char c : uniqueChars) {
                System.out.print(c + " ");
            }
            System.out.println();
        } else {
            System.out.println("No unique characters found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Call the method to find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the unique characters
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}
