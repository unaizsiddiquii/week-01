import java.util.Scanner;

public class FactorsFinder {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner input = new Scanner(System.in);

    // Input the number
    System.out.print("Enter a positive integer: ");
    int number = input.nextInt();

    // Display the factors
    System.out.println("The factors of " + number + " are:");

    // Find factors using a loop
    for (int i = 1; i <= number; i++) {
      // Check if i is a factor
      if (number % i == 0) {
        System.out.println(i);
      }
    }

    input.close();
  }
}
