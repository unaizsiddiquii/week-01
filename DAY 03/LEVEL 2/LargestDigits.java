import java.util.Scanner;

public class LargestDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");

    // number from user
    int number = input.nextInt();
    int maxDigit = 10;
    int[] digits = new int[10];
    int index = 0;
    int largestNumber = Integer.MIN_VALUE;
    int SecondLargestNumber = 0;

    // storing 10 digit in array
    while (number != 0) {
      if (index == maxDigit) {
          break; // Stop if maxDigit is reached
      }
      digits[index] = number % 10; // Get the last digit
      number /= 10; // Remove the last digit
      index++;
  }

    // calculating largest digit and second  largest 
    for (int i = 0; i < index; i++) {
      if (digits[i] > largestNumber) {
        SecondLargestNumber = largestNumber;
        largestNumber = digits[i];
      } else if (digits[i] > SecondLargestNumber && digits[i] != largestNumber) {
        SecondLargestNumber = digits[i];
      }
    }
    // displaing the result
    System.out.println("Largest digit: " + largestNumber);
    System.out.println("Second largest digit: " + SecondLargestNumber);

  }
}
