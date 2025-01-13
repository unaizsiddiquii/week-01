
import java.util.Random;

public class FootballTeamHeights {

    // Method to generate random heights for players
    public static int[] generatePlayerHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Generate random height between 150 and 250 cm
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11;

        // Generate random heights for the football team
        int[] heights = generatePlayerHeights(teamSize);

        // Calculate statistics
        double meanHeight = findMean(heights);
        int shortestHeight = findShortest(heights);
        int tallestHeight = findTallest(heights);

        // Display the heights
        System.out.println("Heights of players in the football team:");
        for (int height : heights) {
            System.out.print(height + " cm ");
        }
        System.out.println();

        // Display the results
        System.out.printf("Mean height: %.2f cm\n", meanHeight);
        System.out.println("Shortest height: " + shortestHeight + " cm");
        System.out.println("Tallest height: " + tallestHeight + " cm");
    }
}
