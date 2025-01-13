import java.util.Scanner;

public class Countdown {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number for countdown : ");
    int value = input.nextInt();
    //printing the number in decrement form with the help of while loop till 1;
    while (value >= 1) {
      System.out.println(value);
      value--;
    }
    input.close();
  }
}
