import java.util.Scanner;

public class CheckNaturalNumberForLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking input of natural number
    System.out.print("Enter a natural number : ");
    int number = input.nextInt();

    // checking it is natural number or not
    boolean isNatural = false;
    if (number > 0 && number != 0) {
      isNatural = true;
    }

    // if it is natural number then goes on this scope
    if (isNatural) {

      // calculating sum of natural number with formula
      int sumOfNaturalNumber = number * (number + 1) / 2;
      System.out.println("sum With formula is " + sumOfNaturalNumber);

      // declare two variable for explanation

      int sum = 0;
      System.out.println("Explanation :--");

      // for loop contain the logic of explanation
      for(int i = 1 ; i <= number ; i++)
      {
        sum += i;
        System.out.println(i+" + "+(i+1)+" = "+sum);
        
      }
    }
    input.close();
  }
}
