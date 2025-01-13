import java.util.Scanner;
public class  NaturalNumbersSumCalculator{
	//Recursive method to find the sum of natural number
	public static int findSum(int number){
		
		if(number == 1){
			return 1;
		}
		return number + findSum(number - 1);
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//getting user input of number
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		
		//calculating the natural number sum by  formula;
		int sumOfNaturalNumber =  number * (number + 1) / 2;
		
		//displaying the result of the sum of natural number
		System.out.println("sum of number by formula : "+sumOfNaturalNumber);
		System.out.println("sum of number by Recursive method : "+findSum(number));

		input.close();
		
	}
}