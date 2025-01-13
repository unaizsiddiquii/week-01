// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

public class FindAgeOfHarry{
	public static void main(String[] args){
		//current year 
		int currentYear = 2024;
		
		//year of birth
		int birthYear = 2000;
		
		//calculating current age of Harry
		int ageOfHarry = currentYear - birthYear;
		
		//printing age of harry
		System.out.print("Harry's age in 2024 is "+ageOfHarry+".");
		
	}
}