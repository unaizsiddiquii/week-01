import java.util.Scanner;

public class NumberChecker5 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Count the number of factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        // Store the factors in the array
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number; // A perfect number is equal to the sum of its proper divisors
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number; // An abundant number has a sum of divisors greater than the number
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number; // A deficient number has a sum of divisors less than the number
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber; // A strong number is equal to the sum of the factorial of its digits
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Perform the operations and display the results
        System.out.println("Factors of the number: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));

        // Check if the number is perfect, abundant, deficient, or strong
        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
