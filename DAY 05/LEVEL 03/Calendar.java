import java.util.Scanner;

public class Calendar {
    
    // Array storing names of the months
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    
    // Array storing number of days in each month
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    static int getDaysInMonth(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month
    static int getFirstDayOfMonth(int year, int month) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;
        return d;
    }

    // Main method to display the calendar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year and month
        System.out.print("Enter year (e.g., 2005): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1;

        // Display the calendar
        System.out.println("\n" + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(year, month);
        int numberOfDays = getDaysInMonth(month, year);

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}