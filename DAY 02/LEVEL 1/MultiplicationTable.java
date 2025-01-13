import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // user input of a number
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    // loop for printing multiplication table of the number
    for (int i = 6; i <= 9; i++) {
      System.out.println(number + " * " + i + " = " + (i * number));
    }
    input.close();
  }
}
