import java.util.Scanner;
public class SwapNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Taking input of number 1 and number 2
    System.out.println("Enter number 1: ");
    int number1 = input.nextInt();
    System.out.println("Enter number 2: ");
    int number2 = input.nextInt();

    // creating temporary(temp) variable to swap two number;
    int temp = number1;
    number1 = number2;
    number2 = temp; 

    // Display swaped number
    System.out.print("The swapped numbers are "+number1+" and "+number2);

    input.close();
  }
}
