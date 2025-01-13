import java.util.Scanner;
public class RemainderAndQuotient{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		//array for storing the remainder and quotient
		int remainderAndQuotient[] = new int[2];
		
		//calculation 
		remainderAndQuotient[0] = number % divisor;
		remainderAndQuotient[1] = number / divisor;
		
		//return the array
		return remainderAndQuotient;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//get the input of number
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		System.out.print("Enter a Divisor : ");
		int divisor = input.nextInt();
		
		//calling the function and store thr return array in to reselt array
		int result[] = findRemainderAndQuotient(number, divisor);
		
		//printing the result
		System.out.println("Remainder : "+result[0]);
		System.out.println("Quotient : "+result[1]);
		
		input.close();
	}
}