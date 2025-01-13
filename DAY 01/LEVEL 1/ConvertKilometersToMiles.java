//Create a program to convert the distance of 10.8 kilometers to miles.

public class ConvertKilometersToMiles{
	public static void main(String[] args){
		//Given kilometers distance
		double kilometers = 10.8;
		
		//calculating kilometers to miles
		double miles = kilometers * 0.621371;
		
		System.out.print("The distance of "+kilometers+" km in miles is "+miles);
		
	}
}