import java.util.Scanner;

public class LeapYear2 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Year: ");
    int year = input.nextInt();

    //check the year is leap year or not and display 
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }

  }
}