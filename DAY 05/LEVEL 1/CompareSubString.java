import java.util.Scanner;

public class CompareSubString {
  // method to findSubString
  public static String findSubString(String string, int startIndex, int endIndex) {

    String subString = "";
    for (int i = startIndex; i < endIndex; i++) {
      subString += string.charAt(i);
    }

    return subString;
  }

  // method to find sub string with built in function
  public static String findSubStringBuiltin(String string, int startIndex, int endIndex) {

    String subString = string.substring(startIndex, endIndex);

    return subString;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // get user input
    System.out.print("Enter a String: ");
    String string = input.next();

    // get start index and end index
    System.out.print("Enter start index : ");
    int startIndex = input.nextInt();
    System.out.print("Enter end index : ");

    // id user enter end index for then a string length then string.length value is
    // assign to end index
    int endIndex = input.nextInt();
    if (endIndex > string.length()) {
      endIndex = string.length();
    }

    // calling the function
    String subString = findSubString(string, startIndex, endIndex);
    String subString2 = findSubStringBuiltin(string, startIndex, endIndex);

    // comparing both method return type with equal method nad displaying the
    // output
    if (subString.equals(subString2)) {
      System.out.println("Substring is equal and sub String is : " + subString);
    } else {
      System.out.println("Substring is not equal");
    }
    input.close();

  }
}
