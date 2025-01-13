//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking user input of base
		System.out.print("Enter base: ");
		double base = input.nextDouble();
		
		//taking user input of height
		System.out.print("Enter height: ");
		double height = input.nextDouble();
		
		//calculating area of traingle in inches
		double areaInches = 0.5 * base * height;
		
		//calculating inches to centimeters square 
		double inchesToCmSquare = 2.54 * 2.54;
		
		//calculating area of traingle in centimeters
		double areaCm = areaInches * inchesToCmSquare;
		
		//printng the result
		System.out.print("Area of triangle in square inches "+areaInches+", in square centimeters "+areaCm);
		input.close();
		
	}
}