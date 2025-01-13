import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        // Array of days in each month (index 0 = January, index 1 = February, etc.)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February in a leap year has 29 days
        }
        return daysInMonth[month - 1];  // Return the number of days for the given month
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it's divisible by 4, but not divisible by 100 unless also divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust the year and month values for the algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;  // Return the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();  // Move to the next line after Saturday
            }
        }
        System.out.println();  // Print a newline after the last day
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the month and year from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Print the calendar for the given month and year
        printCalendar(month, year);

        // Close the scanner
        scanner.close();
    }
}
