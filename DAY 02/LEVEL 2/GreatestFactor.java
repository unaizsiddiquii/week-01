import java.util.Scanner;

public class GreatestFactor {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner input = new Scanner(System.in);

    // Input an integer
    System.out.print("Enter a positive integer: ");
    int number = input.nextInt();

    // Initialize the greatestFactor variable
    int greatestFactor = 1;

    // Check if the number is greater than 1
    if (number > 1) {
      // Loop from number - 1 down to 1
      for (int i = number - 1; i >= 1; i--) {
        // Check if i is a factor of number
        if (number % i == 0) {
          greatestFactor = i; // Assign i to greatestFactor
          break; // Break the loop
        }
      }
    }

    // Display the greatest factor
    System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
  }
}
