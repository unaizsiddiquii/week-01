
import java.util.Scanner;

public class FindSimpleInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking input of Principal, Rate, and Time values
    System.out.print("Enter the Principal: ");
    double principal = input.nextDouble();
    System.out.print("Enter the Rate: ");
    double rate = input.nextDouble();
    System.out.print("Enter the Time: ");
    double time = input.nextDouble();

    // calculating simple imtrest with formula of (principal * rate * time) / 100
    double simpleIntrest = (principal * rate * time) / 100;

    System.out.println("The Simple Interest is "+simpleIntrest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

    input.close();
  }
}
