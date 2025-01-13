
// Write a program the find the distance in yards and miles for the distance provided by user in feets
import java.util.Scanner;
public class FindTheDistance {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // user input of distance in feet
    System.out.print("Enter the distance in feet: ");
    double distanceInFeet = input.nextDouble();

    //converting feet into yard
    double distanceInYard = distanceInFeet * 0.333333;
    
    //converting feet into yard
    double distanceInMiles = distanceInFeet * 0.000189394;

    //displaying the result
    System.out.println("The Distance in feet is " + distanceInFeet + " while in yard is " + distanceInYard
        + " and in Mile is " + distanceInMiles);
        
        input.close();

  }
}
