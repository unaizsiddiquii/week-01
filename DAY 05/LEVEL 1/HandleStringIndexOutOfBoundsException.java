import java.util.Scanner;

//method for occuring exception
public class HandleStringIndexOutOfBoundsException {
  public static char StringIndexOutOfBoundsException(String string) {

    return string.charAt(string.length());

  }

  // method for handling exception
  public static char handleStringIndexOutOfBoundsException(String string) {

    return string.charAt(string.length() - 1);

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // taking user input of string
    System.out.print("Enter a string: ");
    String string = input.next();

    // try and catch block for handling the exception
    try {
      // method call for occuring exception
      StringIndexOutOfBoundsException(string);
    } catch (StringIndexOutOfBoundsException e) {

      System.out.println("Exception:  " + e);
      System.out.println("Handling--------");

      // method call to handle the exception occured in try
      char letter = handleStringIndexOutOfBoundsException(string);
      System.out.println("last letter of " + string + " is : " + letter);

    }

  }
}
