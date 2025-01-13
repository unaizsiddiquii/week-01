import java.util.Scanner;

public class StudentMarksheet {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Enter the marks of physics,chemistry and maths
    System.out.print("Enter the marks of physics: ");
    int physics = input.nextInt();
    System.out.print("Enter the marks of chemistry: ");
    int chemistry = input.nextInt();
    System.out.print("Enter the marks of maths: ");
    int maths = input.nextInt();

    double totalPersentage = (chemistry + physics + maths) * 100 / 240;
    System.out.println("Total persentage is "+totalPersentage);
    if (totalPersentage >= 80) {
      System.out.println("Grade A");
    } else if (totalPersentage >= 70) {
      System.out.println("Grade B");
    } else if (totalPersentage >= 60) {

      System.out.println("Grade C");
    } else if (totalPersentage >= 50) {

      System.out.println("Grade D");
    } else if (totalPersentage >= 40) {

      System.out.println("Grade E");
    } else if (totalPersentage <= 39) {
      System.out.println("Grade R");

    }
  }
}
