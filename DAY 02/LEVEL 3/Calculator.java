import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Take user input for numbers and operator
    System.out.print("Enter the first number: ");
    double number1 = input.nextDouble();

    System.out.print("Enter the second number: ");
    double number2 = input.nextDouble();

    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = input.next().charAt(0);

    double result;

    // Perform the operation based on the operator
    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println("Result: " + result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println("Result: " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println("Result: " + result);
        break;
      case '/':
        if (number2 != 0) {
          result = number1 / number2;
          System.out.println("Result: " + result);
        } else {
          System.out.println("Error: Division by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Invalid operator! Please use +, -, *, or /.");
    }

    input.close();
  }
}
