//Create a program to convert distance in kilometers to miles.
import java.util.Scanner;
public class KilometersToMiles{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Kilometer : ");

		
		//Initializing user input to km
		double km = input.nextDouble();
		
		//Initializing Miles value
		double OneMiles = 0.621371;
		
		//Calculating kilometers to miles
		double kmToMiles = km * OneMiles;
		
		//displaying the result
		System.out.print("The total miles is "+kmToMiles+" mile for the given km "+km);
		
		input.close();
		
		
		
		
	}
}