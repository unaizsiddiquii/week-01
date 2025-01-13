import java.util.Scanner;

public class EmployeesBonus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Your Salary: ");
    double salary = input.nextInt();

    System.out.print("Enter Your Service Year: ");
    int year = input.nextInt();

    // Checking the employee service year
    if (year > 5) {

      // calculating bonus for employee whose service year is more than 5 year

      double bonus = salary * 0.05;

      // adding bonus with salary
      double salaryWithBonus = bonus + salary;
      // displaying the salary with bonus
      System.out.println("Bonus is " + bonus + ", Salary after bonus is " + salaryWithBonus);
    } else {
      // executed when service is less then 5 year
      System.out.println("Your service year is less than 5 year!");
    }
    input.close();

  }
}
