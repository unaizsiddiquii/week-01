import java.util.Scanner;
public class LeapYearFinder{
	//method to find the leap year if year is leap it return true otherwise false
	public static boolean findLeapYear(int year){
		return((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//getting input of year for user
		System.out.print("Enter a number: ");
		int year = input.nextInt();
		
		//displaying the result accordingly the return value 
		if(findLeapYear(year)){
			System.out.println(year+" is leap year");
		}else{
			System.out.println(year+" is not a leap year");
		}
		
		input.close();
	}
}