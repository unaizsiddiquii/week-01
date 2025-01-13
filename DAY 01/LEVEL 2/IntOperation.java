// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
import java.util.Scanner;

public class IntOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking input of a, b, and c
    System.out.println("value of a");
    int a = input.nextInt();
    System.out.println("value of b");
    int b = input.nextInt();
    System.out.println("value of c");
    int c = input.nextInt();

    // calculating the result of a, b, and c
    int result1 = a + b * c;    
    int result2 = a * b + c;     
    int result3 = c + a / b;     
    int result4 = a % b + c;     

    // Display the results
    System.out.println("Result of a + b * c: " + result1);
    System.out.println("Result of a * b + c: " + result2);
    System.out.println("Result of c + a / b: " + result3);
    System.out.println("Result of a % b + c: " + result4);

    input.close();
  }
}
