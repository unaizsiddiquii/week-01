import java.util.Scanner;

public class CheckNaturalNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //taking input of natural number
    System.out.print("Enter a natural number : ");
    int number = input.nextInt();

    // checking it is natural number or not
    boolean isNatural = false;
    if (number > 0 && number != 0) {
      isNatural = true;
    }

    // if it is natural number then goes on this scope
    if(isNatural){

      // calculating sum of natural number with formula 
      int sumOfNaturalNumber =  number*(number+1)/2;
      System.err.println("sum With formula is "+sumOfNaturalNumber);

      // declare two variable for explanation
      int n = 1;
      int sum = 0;
      System.out.println("Explanation :--");

      // while loop contain the logic of explanation
      while(n < number ){
        sum+=n;
        System.out.println(n+" + "+(n+1)+" = "+sum);
        n=n+1;
      }
    }
    input.close();
  }
}
