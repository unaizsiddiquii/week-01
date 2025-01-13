import java.util.Scanner;

public class EmployeesBonus {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// n for store employee count
		int n = 10;

		// for storing employee old salary
		double salary[] = new double[n];

		// employee service years
		double year[] = new double[n];

		// for storing salary with bonus
		double bonusSalary[] = new double[n];

		// storing bonus amount
		double bonusAmount[] = new double[n];

		// variable to store total of bonus, old salary and new salary
		double totalBonus = 0, totalOldSalary = 0, newSalary = 0;

		// for storing the bonus amount of individual employee
		double bonus = 0;

		// counter variable for while loop iteration
		int count = 10;

		// index for array iteration
		int index = 0;

		// loop for taking input from the user of salary and year of service
		while (count > 0) {

			System.out.print("Enter the salary of employee: ");
			salary[index] = input.nextDouble();

			System.out.print("Enter the year of service of employee: ");
			year[index] = input.nextDouble();

			// condition for invalid salary or year input
			if (year[index] < 0 || salary[index] < 0) {
				System.out.println("invalid!  re-enter the salary and the year!");
				continue;
			}

			// index increment for array traversal
			index++;
			count--;

		}

		// loop for calculating each employe bonus according to year of services
		for (int i = 0; i < n; i++) {

			if (year[i] > 5) {

				bonus = salary[i] * 0.05;
				bonusAmount[i] = bonus;
				bonusSalary[i] = salary[i] + bonusAmount[i];

			} else if (year[i] <= 5) {

				bonus = salary[i] * 0.02;
				bonusAmount[i] = bonus;
				bonusSalary[i] = salary[i] + bonusAmount[i];

			}
			totalOldSalary += salary[i];
			newSalary += bonusSalary[i];
			totalBonus += bonus;
			i++;
		}

		System.out.println();

		// loop for printing every employee salary details

		for (int j = 0; j < n; j++) {
			System.out.println("Old salary is : " + salary[j] + " and bonus is : " + bonusAmount[j]
					+ " and with bonus new salary is : " + bonusSalary[j]);
		}

		System.out.println("total old salary of the employee is " + totalOldSalary);
		System.out.println("total new salary of the employee is " + newSalary);
		System.out.println("total bonus of the employee is " + totalBonus);

		input.close();
	}

}