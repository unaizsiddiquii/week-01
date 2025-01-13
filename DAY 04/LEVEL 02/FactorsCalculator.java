import java.util.Scanner;
import java.lang.Math;

public class FactorsCalculator {

	// method to find factors of the number
	public static int[] findFactorsOfNumber(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count = count + 1;
			}
		}
		int factors[] = new int[count];
		int j = 0;
		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				factors[j] = i;
				j++;
			}
		}
		return factors;

	}

	// method to find sum of all factors
	public static int findSumOfFactors(int factors[]) {
		int sum = 0;
		for (int i = 0; i < factors.length; i++) {
			sum += factors[i];
		}
		return sum;
	}

	// method to find the product of all factors
	public static int findProductOfFactors(int factors[]) {
		int product = 1;
		for (int i = 0; i < factors.length; i++) {
			product *= factors[i];
		}
		return product;
	}

	// method to find square of sum of the factors
	public static int findSumOfSquareOfFactors(int factors[]) {
		int sum = findSumOfFactors(factors);
		return (int) (Math.pow(sum, 2));

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// taking input of number from the user
		System.out.print("Enter the number : ");
		int number = input.nextInt();

		// storing the factors of number in factors array and also call the function
		// findFactorOfNumber()
		int factors[] = findFactorsOfNumber(number);

		// calling the method and storing the return type in sum, product, square
		// variable
		int sum = findSumOfFactors(factors);
		int product = findProductOfFactors(factors);
		int square = findSumOfSquareOfFactors(factors);

		for (int i : factors) {
			System.out.print(i + " ");
		}

		//displaying the result
		System.out.println("\n");
		System.out.println("Sum of factors is: " + sum);
		System.out.println("Product of factors is: " + product);
		System.out.println("Square of the sum of the factors is: " + square);

		input.close();
	}
}