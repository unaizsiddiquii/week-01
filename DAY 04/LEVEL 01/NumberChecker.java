import java.util.Scanner;
public class NumberChecker{
		public static int checkNumber(int number){
			
			//checking the number is negetive, positive or zero
			if(number == 0){
				//return 0 for 0 number
				return 0;
			}
			else if(number < 0){
				//return -1 for negetive number
				return -1;
			}else{
				//return 1 for positive number
				return 1;
			}
		}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//get input from user
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//calling the function and storing the return value in result variable
		int result =checkNumber(number);
		
		//displaying the result
		System.out.println(result);
		
		input.close();
		
	}
}