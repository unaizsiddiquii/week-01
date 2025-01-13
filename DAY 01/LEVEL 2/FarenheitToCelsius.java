import java.util.Scanner;

public class FarenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // user input of Fahrenheit
    System.out.print("Enter Temperature in Fahrenheit  : ");
    double fahrenheit  = input.nextDouble();

    // converting fahrenheit to celsius with formula
    double celsiusResult = (fahrenheit - 32) * 5/9 ;

    // displaying the result
    System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

    input.close();
  }
}
