import java.util.Scanner;

public class CheckOddEvenNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	//taking user input
    System.out.print("Enter a number : ");
    int number = input.nextInt();
	
	//checking odd number
    System.out.print("Odd numbers :- ");
    for (int i = 1; i <= number; i++) {
      if (i % 2 == 1) {
        System.out.print(i + " ");
      }
    }
	//checking even number
    System.out.println();
    System.out.print("Even numbers :- ");
    for (int i = 1; i <= number; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }

  }
}
