import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Initial size of the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number > 0) {
            if (index == maxDigit) {
                // Increase maxDigit by 10
                maxDigit += 10;

                // Create a new array with the updated size
                int[] temp = new int[maxDigit];

                // Copy elements from the old array to the new one
                System.arraycopy(digits, 0, temp, 0, index);

                // Update the digits reference
                digits = temp;
            }

            // Add the current digit to the array
            digits[index] = (int) (number % 10);
            index++;
            number /= 10;
        }

        // Find the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second-largest digit is: " + secondLargest);

        input.close();
    }
}
