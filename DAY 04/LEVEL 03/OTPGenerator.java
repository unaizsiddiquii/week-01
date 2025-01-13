import java.util.Scanner;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                // If any two OTPs are the same, return false
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many OTPs they want to generate
        System.out.print("Enter the number of OTPs to generate: ");
        int numOTPs = scanner.nextInt();

        // Create an array to store the OTPs
        int[] otpArray = new int[numOTPs];

        // Generate the OTPs and store them in the array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("\nGenerated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otpArray);

        // Display the result
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are duplicates.");
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
