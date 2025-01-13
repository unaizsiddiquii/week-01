// Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;
public class MaximumHandshakes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //taking user input of total student
    System.out.print("Enter the number of Student : ");
    int numberOfStudents = input.nextInt();

    //calculating maximum possible handshake
    int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    // displaying total possible handshakes
    System.out.print("The number of possible handshakes is "+maximumHandshakes);
  }
}
