import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Take user input for month, day, and year
    System.out.print("Enter the month : ");
    int month = input.nextInt();

    System.out.print("Enter the day : ");
    int day = input.nextInt();

    System.out.print("Enter the year : ");
    int year = input.nextInt();

    // Apply the formula to calculate the day of the week
    int y0 = year - (14 - month) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = month + 12 * ((14 - month) / 12) - 2;
    int dayOfWeek = (day + x + 31 * m0 / 12) % 7;

    // Print the day of the week as an integer
    System.out.println("The day of the week is: " + dayOfWeek);

    // Close the input scanner
    input.close();
  }
}
