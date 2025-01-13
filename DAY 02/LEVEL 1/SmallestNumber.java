import java.util.Scanner;

public class SmallestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number 1 : ");
    int number1 = input.nextInt();
    System.out.print("Enter a number 1 : ");
    int number2 = input.nextInt();
    System.out.print("Enter a number 1 : ");
    int number3 = input.nextInt();

    //declare bool for checking small or not
    boolean isSmall = false;

    // checking Is the first number is smallest or not;
    if (number1 < number2) {
      if (number1 < number3) {
        isSmall = true;
        System.out.print("Is the first number the smallest? " + isSmall);
      }
    } else {
      System.out.print("Is the first number the smallest? " + isSmall);
    }
    input.close();
  }
}