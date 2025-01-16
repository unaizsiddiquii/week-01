import java.util.Scanner;

//creating class here
public class CharacterFrequency2 {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        // Create a string to store unique characters
        StringBuilder uniqueChars = new StringBuilder();

        // Loop through the text and find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }

        // Return the unique characters as a char array
        char[] uniqueArray = new char[uniqueChars.length()];
        uniqueChars.getChars(0, uniqueChars.length(), uniqueArray, 0);
        return uniqueArray;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Create an array of size 256 to store frequency of each ASCII character
        int[] frequency = new int[256];

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Call uniqueCharacters to get the unique characters in the text
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store them and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
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
