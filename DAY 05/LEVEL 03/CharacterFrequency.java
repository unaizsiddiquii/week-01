import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in the string
    public static String[] findCharacterFrequency(String text) {
        // Convert the text to a character array
        char[] charArray = text.toCharArray();
        int[] frequency = new int[charArray.length];
        String[] result = new String[charArray.length];

        // Initialize frequency array and result array
        for (int i = 0; i < charArray.length; i++) {
            frequency[i] = 1; // Initialize each character frequency to 1
        }

        // using loops here
        for (int i = 0; i < charArray.length; i++) {
            // Skip the already counted characters
            if (charArray[i] == '0') {
                continue;
            }

            // Compare with the rest of the characters in the string
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++; // Increment frequency of the character
                    charArray[j] = '0';
                }
            }

            // Store the character and its frequency in the result array
            result[i] = charArray[i] + ": " + frequency[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("\nCharacter frequencies:");
        for (String entry : frequencies) {
            if (entry != null) {
                System.out.println(entry);
            }
        }

        scanner.close();
    }
}
