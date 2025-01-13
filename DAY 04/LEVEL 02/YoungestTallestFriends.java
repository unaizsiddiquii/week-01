import java.util.Scanner;

public class YoungestTallestFriends {

    // Method to find the youngest among three friends
    public static String findYoungest(int[] ages, String[] names) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    // Method to find the tallest among three friends
    public static String findTallest(double[] heights, String[] names) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights for the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find and display the youngest friend
        String youngest = findYoungest(ages, names);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(heights, names);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
