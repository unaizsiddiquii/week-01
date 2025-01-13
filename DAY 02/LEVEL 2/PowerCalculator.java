import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        // Input the power
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initialize the result variable
        int result = 1;

        // Calculate the power using a loop
        for (int i = 1; i <= power; i++) {
            result *= number; 
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        input.close();
    }
}
