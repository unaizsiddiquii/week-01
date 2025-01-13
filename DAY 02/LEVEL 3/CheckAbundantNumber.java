import java.util.Scanner;

public class CheckAbundantNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // input of the number
    System.out.println("Enter a number: ");
    int number = input.nextInt();
    // Initialize sum to store the sum of divisor
    int sum = 0;

    // itrating loop for finding divisor
    for (int i = 1; i < number; i++) {
      // condition for divisor
      if (number % i == 0) {
        sum += i;
      }
    }
     
    // displaying the Abundant Number
    if (sum > number) {
      System.out.println(number + " isAbundantNumber");

    } else {
      System.out.println(number + " is not  Abundant Number");

    }
  }
}
