import java.util.Scanner;

public class TotalIncome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // user input of salary
    System.out.print("Enter salary amount : ");
    double salary = input.nextInt();

    // user input of bonus
    System.out.print("Enter bonus amount : ");
    double bonus = input.nextInt();

    // calculating total income by adding salary and bonus
    double totalIncome = salary + bonus;

    // displaing total income
    System.out.print("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

    input.close();
  }
}
