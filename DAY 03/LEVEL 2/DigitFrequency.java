import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Take input 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Create an array 
        int[] frequency = new int[10];
        while (number > 0) {
            int digit = number % 10; // Extract last digit
            frequency[digit]++; 
            number /= 10; 
        }

        // Display the frequency 
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

    }
}