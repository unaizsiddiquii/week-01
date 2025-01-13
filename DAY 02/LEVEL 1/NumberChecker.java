import java.util.Scanner;

public class NumberChecker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // number input from user
    System.out.print("Enter a number : ");
    int number = input.nextInt();

    // checking the number is positive, negative or zero
    if (number == 0) {
      System.out.println("Zero");
    } else if (number < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Positive");
    }
    input.close();

  }
}
