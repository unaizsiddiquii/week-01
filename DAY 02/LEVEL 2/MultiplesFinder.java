import java.util.Scanner;

public class MultiplesFinder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Input the number
    System.out.print("Enter a positive integer: ");
    int number = input.nextInt();

    // Display the multiples
    System.out.println("The multiples of " + number + " below 100 are:");

    // Find multiples using a loop
    for (int i = 100; i >= 1; i--) {
      // Check if i is a multiple of the number
      if (i % number == 0) {
        System.out.println(i);
      }
    }

    input.close();
  }
}
