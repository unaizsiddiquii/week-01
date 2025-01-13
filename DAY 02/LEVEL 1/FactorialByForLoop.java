import java.util.Scanner;

public class FactorialByForLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // take a input of a number from user
    System.out.print("Enter any number : ");
    int number = input.nextInt();
    int fact = 1;

    // calculating factorial of given number by multiplying each number;
    for(int i = 1 ; i <= number ; i++){
      fact *= i;
    }
    System.out.println("Factorial of " + number + " is " + fact);
  }
}
