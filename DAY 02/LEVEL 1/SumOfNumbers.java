import java.util.Scanner;
public class SumOfNumbers {
  public static void main(String[] args){
	  Scanner input =  new Scanner(System.in);
	  
	  //declering total variable for store sum of total number
	  double total = 0.0;
	  
	  // while loop for taking multiple input from user
	  while(true){
		  System.out.print("Enter any number and 0 to stop: ");
		  
		  //declare numbers variable to take input from the user
		  double number = input.nextDouble();
		  
		  //condition to check user enter 0 or not 
		  if(number!=0){
			  total += number;
			  continue;
		  }
			  break;
		  
	  }
	  //displaying the sum of total numbers entered by user
	  System.out.print("sum of numbers entered by user is :"+total);
	  input.close();
  }
}
