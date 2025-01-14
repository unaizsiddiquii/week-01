import java.util.Scanner;

public class HandleIllegalArgumentExceptionDemo {

    // Method to generate the IllegalArgumentException
    public static void generateException(String input) {
        // Intentionally setting the start index greater than the end index for
        // substring
        System.out.println("Attempting to get a substring with invalid indices:");
        String result = input.substring(4, 3); // This will throw IllegalArgumentException
        throw new IllegalArgumentException();
    }

    // Method to handle the IllegalArgumentException
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to get a substring inside try block:");
            String result = input.substring(4, 3); 
            // This will throw IllegalArgumentException
            throw new IllegalArgumentException("IllegalArgumentException");
        } catch (Exception e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = sc.nextLine();

        // Call the method to generate the exception
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(input);

        sc.close();
    }
}