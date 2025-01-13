import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate from 1 to the number and classify numbers as odd or even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
