//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

public class ProfitCalculator{
	public static void main(String[] args){
		//cost price of the product
		int costPrice = 129;
		
		//selling price of the project
		int sellingPrice = 191;
		
		//calculating profit
		int profit = sellingPrice - costPrice;
		
		//calculating profit percentage - divide profit and cost price then multiplying it to get the profit percentage
		double profitPercentage = ((double)profit/costPrice) * 100;
		
		//printing profit and profit percentage
		
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
		
		
	}
}