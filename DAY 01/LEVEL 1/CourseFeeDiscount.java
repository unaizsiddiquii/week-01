//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

public class CourseFeeDiscount {
	public static void main(String[] args){
		// Initializing the course fee
		double fee = 125000;
		
		//Initializing discount percent 
		double discountPercent = 10;
		
		 // Calculating the discounted amount
		double discount = (fee*discountPercent)/100;
		
		//Calculating the discounted fee student will pay
		double discountedFee = fee - discount;
		
		//Printing the discounted amount and final discounted fee
		System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFee);
		
	}
}