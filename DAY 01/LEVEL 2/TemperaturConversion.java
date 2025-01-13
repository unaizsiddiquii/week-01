import java.util.Scanner;

public class TemperaturConversion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //user input of celsius
    System.out.print("Enter Temperature in Celsius : ");
    double celsius = input.nextDouble();
     
    //converting celsius to fahrenheit with formula
    double farenheitResult  = (celsius * 9 / 5) + 32;

    //displaying the result 
    System.out.println("The " + celsius + " celsius is " + farenheitResult  + " fahrenheit");

    input.close();
  }
}
