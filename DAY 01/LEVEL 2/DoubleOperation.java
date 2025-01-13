
import java.util.Scanner;

public class DoubleOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking input of a, b, and c
    System.out.println("value of a");
    double a = input.nextDouble();
    System.out.println("value of b");
    double b = input.nextDouble();
    System.out.println("value of c");
    double c = input.nextDouble();

    // calculating the result of a, b, and c
    double result1 = a + b * c;
    double result2 = a * b + c;
    double result3 = c + a / b;
    double result4 = a % b + c;

    // Display the results
    System.out.println("Result of a + b * c: " + result1);
    System.out.println("Result of a * b + c: " + result2);
    System.out.println("Result of c + a / b: " + result3);
    System.out.println("Result of a % b + c: " + result4);

    input.close();
  }
}
