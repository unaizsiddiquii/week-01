import java.util.Scanner;
public class SmallestAndLargestCalculator{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int largest = -1;
		int secondLargest = -1;
		int largestSecond[] = new int[2];
		if(number1 > number2 && number1 > number3){
			largestSecond[0] = number1;
			if(number2 > number3){
				largestSecond[1] = number2;
			}else{
				largestSecond[1] = number3;
			}
		}else if(number2 > number3 && number2 > number1){
			largestSecond[0] = number2;
			if(number1 > number3){
				largestSecond[1] = number1;
			}else{
				largestSecond[1] = number3;
			}
		}else{
			largestSecond[0] = number3;
			if(number1 > number2){
				largestSecond[1] = number1;
			}else{
				largestSecond[1] = number2;
			}
		}
		return largestSecond;
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//get the input of number1 number 2 and number 3
		System.out.print("Enter a number1 : ");
		int number1 = input.nextInt();
		System.out.print("Enter a number2 : ");
		int number2 = input.nextInt();
		System.out.print("Enter a number3 : ");
		int number3 = input.nextInt();
		
		int result[] = findSmallestAndLargest(number1, number2, number3);
		System.out.println("Largest number is: "+result[0]);
		System.out.println("Second Largest number is: "+result[1]);
		
		input.close();
	}
}