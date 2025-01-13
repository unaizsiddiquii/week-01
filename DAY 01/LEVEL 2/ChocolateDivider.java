import java.util.Scanner;

public class ChocolateDivider {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of chocolates: ");
    int numberOfChocolates = input.nextInt();

    System.out.print("Enter the number of children: ");
    int numberOfChildren = input.nextInt();

    // calculating distributed Chocolate to children
    int distributChocolate = numberOfChocolates / numberOfChildren;
    // calculating remaining Chocolate
    int remainingChocolate = numberOfChocolates % numberOfChildren;
    
    //Displaying the the result of remaining Chocolate ant distributed Chocolates
    System.out.println("The number of chocolates each child gets is " + distributChocolate
        + " and the number of remaining chocolates are " + remainingChocolate);
        
        input.close();
  }

}