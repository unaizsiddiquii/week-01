import java.util.Scanner;

public class UpperCase {

  //method to convert lower case to upperCase
  public static String convertToUpperCase(String string) {

    String upperCaseString = new String();
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      if (ch >= 'a' && ch <= 'z') {

        ch = (char) (ch - 32);
        upperCaseString += ch;

      } else {         

        upperCaseString += ch;
      }

    }
    return upperCaseString;

  }
  //method to compare the string with input string
  public static boolean compareString(String string, String upperCaseString) {

    if (string.toUpperCase().equals(upperCaseString)) {
      return true;
    }
    return false;

  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // taking a string input from user
    System.out.print("Enter a string : ");
    String string = input.nextLine();

    String upperCaseString = convertToUpperCase(string);

    // showing result 
    if (compareString(string, upperCaseString)) {

      System.out.println("Both string are same... ");

    } else {
      System.out.println("String is not same...");
    }

    // printing the string conversion
    System.out.println("String in capital : " + upperCaseString);

  }
}
