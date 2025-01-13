import java.util.Scanner;

public class EmployeeBonus {

    // Method to input salaries and years of service
    public static int[][] inputSalaryAndService(int numEmployees) {
        Scanner scanner = new Scanner(System.in);
        int[][] data = new int[numEmployees][2]; // [salary, years of service]

        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Enter salary for Employee %d: ", (i + 1));
            data[i][0] = scanner.nextInt();

            System.out.printf("Enter years of service for Employee %d: ", (i + 1));
            data[i][1] = scanner.nextInt();
        }

        return data;
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][3]; // [bonus, new salary, bonus amount]

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int yearsOfService = data[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            result[i][0] = bonusAmount;
            result[i][1] = newSalary;
            result[i][2] = bonusPercentage * 100; // Storing bonus percentage for clarity
        }

        return result;
    }

    // Method to calculate and display the total amounts
    public static void displaySummary(int[][] data, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears of Service\tBonus (%)\tBonus Amount\tNew Salary");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int yearsOfService = data[i][1];
            double bonusPercentage = result[i][2];
            double bonusAmount = result[i][0];
            double newSalary = result[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;

            System.out.printf("%-9d\t%-10d\t%-16d\t%-9.2f\t%-12.2f\t%-10.2f\n",
                    (i + 1), oldSalary, yearsOfService, bonusPercentage, bonusAmount, newSalary);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("TOTAL\t\t%-10.2f\t\t\t\t\t\t%-12.2f\t%-10.2f\n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        // Step 2: Input salaries and years of service
        int[][] salaryAndService = inputSalaryAndService(numEmployees);

        // Step 3: Calculate bonuses and new salaries
        double[][] bonusAndNewSalary = calculateBonusAndNewSalary(salaryAndService);

        // Step 4: Display summary
        displaySummary(salaryAndService, bonusAndNewSalary);

        scanner.close();
    }
}
