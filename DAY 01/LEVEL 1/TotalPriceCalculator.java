// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

import java.util.Scanner;
public class TotalPriceCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //prompt for taking user input of unit price
    System.out.print("Enter Price of the Item : ");
    double unitPrice = input.nextDouble();

    //prompt for taking user input for quatity of the item
    System.out.print("Enter Quantity of the Item : ");
    int quantity = input.nextInt();

    //calculating the total price by multiplying the per unit price by quantity of the product
    double totalPrice = unitPrice * quantity;

    // Display the total price with unit price and quantity
    System.out.print("The total purchase price is INR "+totalPrice +" the quantity is " +quantity+" and unit price is INR "+unitPrice);

  }
}
