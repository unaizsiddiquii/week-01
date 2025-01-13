import java.util.Scanner;

public class VotingEligibility {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	//input of age from the user
    System.out.print("Enter age: ");
    int age = input.nextInt();
	
	//checking the eligibility  of vote with if-else
    if (age >= 18) {
      System.out.println("The person can vote.");
    } else {
      System.out.println("The person cannot vote.");
    }
  }
}
