import java.util.Scanner;

public class NaturalNumberChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a natural number: ");
    int number = input.nextInt();
    int sumOfNaturalNumber = number * (number + 1) / 2;
    if (number > 0) {

      System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumber);

    } else {
      System.out.println("The number " + number + " is not a natural number");

    }

  }
}
