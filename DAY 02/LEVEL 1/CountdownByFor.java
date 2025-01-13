import java.util.Scanner;

public class CountdownByFor {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number for countdown : ");
    int value = input.nextInt();
    // printing the number in decrement form with the help of for loop till 1;
    for (int i = 1; value >= i; value--) {
      System.out.println(value);
    }
    input.close();
  }
}
