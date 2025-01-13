import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        // Get user input to store in the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array to analyze each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        System.out.print("The first element (" + firstElement + ") is ");
        if (firstElement > lastElement) {
            System.out.println("greater than the last element (" + lastElement + ").");
        } else if (firstElement < lastElement) {
            System.out.println("less than the last element (" + lastElement + ").");
        } else {
            System.out.println("equal to the last element (" + lastElement + ").");
        }

        input.close();
    }
}