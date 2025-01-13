import java.util.Scanner;

public class ChocolatesDistribution {
  public static void main(String[] args) {
    Scanner input = new Scanner((System.in));

    System.out.print("Enter the number of chocolates : ");
    int numberOfchocolates = input.nextInt();

    System.out.print("Enter the number of student : ");
      int numberOfChildren = input.nextInt();

      int getChocolate = numberOfchocolates/numberOfChildren;
      int remaningChocolate = numberOfchocolates%numberOfChildren;

      System.out.print("The number of chocolates each child gets is "+getChocolate+" and the number of remaining chocolates are "+remaningChocolate);

   }
}
