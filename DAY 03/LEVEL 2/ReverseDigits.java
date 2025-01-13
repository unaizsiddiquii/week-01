import java.util.Scanner;

public class ReverseDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking user input of number
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    // copy of input number
    int originalNumber = number;

    // for store digit count
    int digitCount = 0;

    // loop for counting number of digits
    while (number != 0) {
      digitCount++;
      number /= 10;
    }

    // array for storing digit
    int[] digits = new int[digitCount];

    // storing digits in array in reverse order
    for (int i = digitCount - 1; i >= 0; i--) {
      digits[i] = originalNumber % 10;
      originalNumber = originalNumber / 10;
    }

    System.out.println("Count of the digits is : " + digitCount);

    // displaying the array in reverse order
    for (int i = digits.length - 1; i >= 0; i--) {
      System.out.print(digits[i] + " ");
    }
    input.close();
  }

}
