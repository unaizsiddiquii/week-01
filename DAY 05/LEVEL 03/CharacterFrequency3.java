import java.util.Scanner;

public class CharacterFrequency3 {

    // Method to find the frequency of characters using charAt()
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store frequency of each ASCII character (256 possible
        // characters)
        int[] frequency = new int[256];

        // Loop through the string to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Create an array to store characters and their frequencies
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Store the characters and their frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Convert the ASCII value to the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        return result;
    }

    // Method to display the result
    public static void displayResult(String[][] result) {
        System.out.println("Character\tFrequency");
        System.out.println("-----------------------");
        for (String[] entry : result) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Call the method to find character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display the result
        displayResult(frequencies);

        scanner.close();
    }
}
