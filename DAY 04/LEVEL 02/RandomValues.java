import java.util.Scanner;
import java.util.Random;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generate 4-digit random number
        }
        return numbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of random values to generate: ");
        int size = sc.nextInt();

        // Generate random values and calculate statistics
        int[] randomNumbers = generate4DigitRandomArray(size);
        double[] results = findAverageMinMax(randomNumbers);

        // Display the random values
        System.out.println("Generated 4-digit random values:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the average, min, and max
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);

        sc.close();
    }
}
