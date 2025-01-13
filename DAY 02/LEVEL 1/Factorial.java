import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // take a input of a number from user 
    System.out.print("Enter any number : ");
    int number = input.nextInt();
    int fact = 1;
    int n = number;

    // calculating factorial of given number by multiplying each number;
    while (n > 0) {
      fact *= n;
      n--;
    }
    System.out.println("Factorial of "+number+" is "+fact);
  }
}
