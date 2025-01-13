import java.util.Scanner;

public class DigitsCounter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // input of the number
    System.out.println("Enter the number : ");
    int number = input.nextInt();

    // Initialize counter
    int count = 0;

    // counting digits by iterating every number in loop
    while (number > 0) {

      number = number / 10;
      // increase count in every iteration
      count++;

    }
    // displaying the result
    System.out.println("Total digit in number is " + count);

    input.close();
  }

}