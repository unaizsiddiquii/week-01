import java.util.Scanner;
public class ChocolatesDistribution{
	public static int[] chocolatesDistribute(int numberOfchocolates, int numberOfChildren){
		//array for storing chocolates 
		int chocolates[] = new int[2];
		
		//calculation 
		chocolates[0] = numberOfchocolates % numberOfChildren;
		chocolates[1] = numberOfchocolates / numberOfChildren;
		
		//return the array
		return chocolates;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//get the input of chocolates and children
		System.out.print("Enter a number of Chocolates : ");
		int numberOfchocolates  = input.nextInt();
		System.out.print("Enter a number Of Children : ");
		int numberOfChildren = input.nextInt();
		
		//calling the function and store the return array in to result array
		int result[] = chocolatesDistribute(numberOfchocolates, numberOfChildren);
		
		//printing the result of remaining chocolates and get 
		System.out.println("Remaining: "+result[0]);
		System.out.println("Each children get : "+result[1]);
		
		input.close();
	}
}