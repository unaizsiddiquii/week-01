import java.util.Scanner;

public class LowerCase {
  //method to convert upper case to loweerCase
  public static String convertTolowerCase(String string) {

    String lowerCaseString = new String();
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {

        ch = (char) (ch + 32);
        lowerCaseString += ch;

      } else {

        lowerCaseString += ch;
      }

    }
    return lowerCaseString;

  }

  // method to compare the string with input string
  public static boolean compareString(String string, String lowerCaseString) {

    if (string.toLowerCase().equals(lowerCaseString)) {
      return true;
    }
    return false;

  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // taking a string input from user
    System.out.print("Enter a string : ");
    String string = input.nextLine();

    // call ing the method and storing the return value
    String lowerCaseString = convertTolowerCase(string);

    if (compareString(string, lowerCaseString)) {

      System.out.println("Both string are same... ");

    } else {
      System.out.println("String is not same...");
    }

    // printing the string conversion
    System.out.println("String in lower case : " + lowerCaseString);

  }

}
