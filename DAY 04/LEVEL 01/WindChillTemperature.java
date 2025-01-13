import java.util.Scanner;
import java.lang.Math;
public class WindChillTemperature{
	public static double calculateWindChill(double temperature,double windSpeed){
		
		//formula to find wind chill
		double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * (Math.pow(windSpeed,0.16));
		
		//return the result of wind chill
		return windChill;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//input of temperature and wind speed
		System.out.print("Enter a Temperature: ");
		double temperature = input.nextInt();
		System.out.print("Enter a windSpeed: ");
		double windSpeed = input.nextInt();
		
		//storing the result and calling the function
		double result = calculateWindChill(temperature,windSpeed);
		
		//printing the result
		System.out.println("Wind Chill is : "+result);
		
		input.close();
	}
}