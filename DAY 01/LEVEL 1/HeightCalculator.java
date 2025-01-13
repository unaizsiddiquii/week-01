//Write a program that takes your height in centimeters and converts it into feet and inches
import java.util.Scanner;
public class HeightCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter you height in centimeters : ");
		
		//Taking User input of height
		double heightCM = input.nextDouble();
		
		//calculating height in feet
		double heightFeet = heightCM * 0.0328084;
		
		//calculating height in centimeters
		double heightInches = heightCM * 0.393701;
		
		//printing the height in feet and inches
		System.out.print("Your Height in cm is "+heightCM+" while in feet is "+heightFeet+" and inches is "+heightInches);
		
		input.close();
	}
	
}