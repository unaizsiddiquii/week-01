import java.util.Scanner;

public class DivisibleOf5 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter any number: ");
    int number = input.nextInt();
    boolean isDivisible = false;
    if (number % 5 == 0) {
      isDivisible = true;
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    } else {
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

    }
    input.close();
  }
}