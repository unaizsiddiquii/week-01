import java.util.Scanner;

public class LengthOfString {
  // method to generate the exception and count the length of the string
  public static int findLengthOfString(String string) {
    // variable which hold the length value
    int count = 0;
    int i = 0;

    try {

      // loop is break when exception is thrown
      while (true) {
        string.charAt(i);
        i++;
        count++;
      }
    } catch (Exception e) {
      System.out.println("---handling---");
    }

    return count;

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // getting user input
    System.out.print("Enter string: ");
    String string = input.nextLine();

    // method call to find the length of string
    int lengthOfString = findLengthOfString(string);
    // display the result
    System.out.println("Length of String is " + lengthOfString);
    System.out.println("Length of String with builtin method is " + string.length());

    input.close();
  }
}
