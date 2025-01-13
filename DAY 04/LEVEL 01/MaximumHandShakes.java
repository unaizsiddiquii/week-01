import java.util.Scanner;
public class MaximumHandShakes {
	public static int maximumHandshakes(int numberOfStudents){
		//calculating and return the maximum possible handshake
		return (numberOfStudents * (numberOfStudents - 1)) / 2;

	}
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //taking user input of total student
    System.out.print("Enter the number of Student : ");
    int numberOfStudents = input.nextInt();
	
	//calling function and store the return value in result variable
	int result = maximumHandshakes(numberOfStudents);
    // displaying total possible handshakes
    System.out.print("The number of possible handshakes is "+result);
  }
}
