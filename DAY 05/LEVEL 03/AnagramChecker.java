import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase for comparison
        // \\s ignores the whitespaces and tabs and converts into the string
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the texts
        int[] frequencyText1 = new int[26];
        int[] frequencyText2 = new int[26];

        // Count the frequency of each character in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequencyText1[text1.charAt(i) - 'a']++;
            frequencyText2[text2.charAt(i) - 'a']++;
        }

        // Compare the frequencies of characters in both texts
        for (int i = 0; i < 26; i++) {
            if (frequencyText1[i] != frequencyText2[i]) {
                return false; // If frequencies don't match, return false
            }
        }

        return true; // return true (texts are anagrams)

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Calling the method to check if the texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
