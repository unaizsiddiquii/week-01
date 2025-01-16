import java.util.*;

//creating a clas TrimmingSpaces
public class TrimmingSpaces {
    // creating method here
    public static int[] ManuallyFinding(String str) {
        // checking if string is null or empty
        if (str == null || str.isEmpty()) {
            // returning indices here in array
            return new int[] { 0, 0 };
        }
        // taking indices here
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end + 1 };
    }

    // creating method here for checking valid string
    public static String Substring(String str, int start, int end) {
        if (str == null || start >= end) {
            return "";
        }
        // taking string builder class here
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            // appending characters in substring
            substring.append(str.charAt(i));
        }
        // converting characters in a string
        return substring.toString();
    }

    // making method for comparing
    public static boolean Comparing(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "  Hello, World! ";

        // Manually trim spaces
        int[] indices = ManuallyFinding(input);
        String manuallyTrimmed = Substring(input, indices[0], indices[1]);

        // Trim using built-in method
        String builtInTrimmed = input.trim();

        // Compare the manually trimmed and built-in trimmed strings
        boolean isEqual = Comparing(manuallyTrimmed, builtInTrimmed);

        // Display results
        System.out.println("Original String: '" + input + "'");
        System.out.println("Manually Trimmed: '" + manuallyTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);
    }
}
