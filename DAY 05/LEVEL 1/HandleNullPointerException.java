import java.util.Scanner;

public class HandleNullPointerException {

  // method for generate exceptio
  public static int stringLength(String str) {
    return str.length();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String string = null;
    //  try catch block for handling the exception
    try {

      System.out.println(stringLength(string));
    } catch (NullPointerException e) {

      // handling the exception
      System.out.println(e);
      // user input for change the string
      System.out.print("Enter String :");
      string = input.next();
      System.out.println("Length of string is: " + stringLength(string));

    }

  }
}