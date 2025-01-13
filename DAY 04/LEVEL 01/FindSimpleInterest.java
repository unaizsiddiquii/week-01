import java.util.Scanner;

public class FindSimpleInterest {
	public static double simpleIntrest(double principal, double rate, double time){
		// calculating and return simple interest with formula of (principal * rate * time) / 100
		 return (principal * rate * time) / 100;
	}
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking input of Principal, Rate, and Time values
    System.out.print("Enter the Principal: ");
    double principal = input.nextDouble();
    System.out.print("Enter the Rate: ");
    double rate = input.nextDouble();
    System.out.print("Enter the Time: ");
    double time = input.nextDouble();
	
	//calling function ad store the result in result variable
	double result = simpleIntrest(principal,rate,time);
	
    System.out.println("The Simple Interest is "+result+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

    input.close();
  }
}
