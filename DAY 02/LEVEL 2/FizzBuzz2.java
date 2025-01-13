import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            
            int i = 1;

            // Loop from 1 to the input number using a while loop
            while (i <= number) {
                // Check conditions for Fizz, Buzz, and FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                
                i++;
            }
        }
    }
}
