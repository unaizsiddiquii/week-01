//Write a new program similar to the program # 6 but take user input for Student Fee and University Discount

import java.util.Scanner;
public class CourseFeeDiscount2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Initializing user input of course fee in fee
		System.out.print("Enter Your Fee : ");
		double fee = input.nextDouble();
		
		//Initializing user input of discount percent 
		System.out.print("Enter University Discount Persent : ");
		double discountPercent = input.nextDouble();
		
		// Calculating the discounted amount
		double discount = (fee*discountPercent)/100;
		
		//Calculating the discounted fee student will pay
		double discountedFee = fee - discount;
		
		//Printing the discounted amount and final discounted fee
		System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFee);
		input.close();
		
	}
}