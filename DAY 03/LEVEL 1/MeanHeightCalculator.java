import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
        // Define an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Get the heights of 11 players from the user
        System.out.println("Enter the heights of 11 players in the football team:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Add the height to the sum
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("\nThe mean height of the football team is: " + mean);

        input.close();
    }
}
