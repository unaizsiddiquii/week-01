import java.util.Scanner;

public class CompareStrings {
  public static boolean compareString(String str1, String str2) {

    boolean isStrLength = str1.length() == str2.length();

    if (isStrLength) {
      for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // take input of strings from user
    System.out.print("Enter String 1 : ");
    String str1 = input.next().toLowerCase();
    System.out.print("Enter String 2 : ");
    String str2 = input.next().toLowerCase();

    // calling the function and store return value
    boolean isEqual = compareString(str1, str2);

    // checking by builtin method equal()
    boolean isEqualByBuiltinMethod = str1.equals(str2);

    // checking with boolean return value of function and builtin function
    if (isEqual == true && isEqualByBuiltinMethod == true) {
      System.out.println("String are equal");
    } else {
      System.out.println("String is not equal");
    }
    input.close();

  }
}