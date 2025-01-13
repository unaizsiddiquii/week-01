import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object named input for user input
        Scanner input = new Scanner(System.in);

        // Input age and height for Amar
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = input.nextInt();

        // Input age and height for Akbar
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = input.nextInt();

        // Input age and height for Anthony
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = input.nextInt();

        // Find the youngest friend
        String youngestFriend;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngestFriend = "Amar";
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend
        String tallestFriend;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallestFriend = "Amar";
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}
