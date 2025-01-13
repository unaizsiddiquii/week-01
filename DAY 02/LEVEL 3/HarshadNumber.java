import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // input of a number
    System.out.print("Enter a number : ");
    int number = input.nextInt();

    // copy of the number
    int originalNumber = number;
    // Initialize reminder for store total digit sum
    int sum = 0;
    // Initialize reminder to store every last digit of number
    int reminder = 0;

    while (number > 0) {
      // storing last digit of number
      reminder = number % 10;
      // adding sum of the digit
      sum += reminder;
      number /= 10;
    }
    if (number % sum == 0) {
      System.out.println(originalNumber + " is HarshadNumber");

    } else {
      System.out.println(originalNumber + " is not a HarshadNumber");
    }
    input.close();
  }
}
