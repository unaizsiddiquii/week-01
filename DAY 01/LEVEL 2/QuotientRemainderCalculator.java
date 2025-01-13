
// Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;

public class QuotientRemainderCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // user input of number 1
    System.out.print("Enter number 1: ");
    float number1 = input.nextInt();

    // user input of number 2
    System.out.print("Enter number 2: ");
    float number2 = input.nextInt();

    // calculating quotient and reminder
    float quotient = number1 / number2;
    float reminder = number1 % number2;

    // displaying result
    System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1
        + " and " + number2);

    input.close();

  }
}