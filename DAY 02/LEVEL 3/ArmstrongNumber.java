import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the original number for later comparison
        int originalNumber = number;
        
        // Initialize the sum variable to 0
        int sum = 0;

        // Loop until the number becomes 0
        while (number != 0) {
            // Find the last digit of the number 
            int digit = number % 10;

            // Cube the digit and add it to the sum
            sum += digit * digit * digit;

            // Remove the last digit by dividing the number by 10
            number = number / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        input.close();
    }
}
