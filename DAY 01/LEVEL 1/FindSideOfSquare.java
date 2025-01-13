// Write a program to find the side of the square whose parameter you read from user 
import java.util.Scanner;
public class FindSideOfSquare {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    //taking input form user of the parameter of the square
    System.out.println("Enter the parameter of square : ");
    double parameter = input.nextDouble();

    //calculating side of square by parameter
    double sideOfSquare = parameter/4;

    System.out.println("The length of the side is "+sideOfSquare+" whose perimeter is "+parameter);
    input.close();
  }
}