import java.util.Scanner;
public class NaturalNumberSumCalculator{
	public static int sumOfNaturalNumber(int number){
		int sum = 0;
		int i = 1;
		
		//loop for calculating the sum of n natural number
		while(i <= number){
			sum+=i;
			i++;
		}
		//return the sum
		return sum;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = input.nextInt();
		
		//storing result in sum variable
		int sum = sumOfNaturalNumber(number);
		
		//printing the result 
		System.out.print("the sum of number is "+sum);
	}
}