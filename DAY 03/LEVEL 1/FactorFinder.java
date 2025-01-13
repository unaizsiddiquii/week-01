import java.util.Scanner;
import java.util.Arrays;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Initialize variables for factors array and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If index reaches maxFactor, expand the array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    factors = Arrays.copyOf(factors, maxFactor);
                }
                factors[index++] = i;
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
