import java.util.Scanner;

public class StringCharacterComparison {

  // method to convert string into character arrar
  public static char[] inputString(String str) {

    char[] result = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
      result[i] = str.charAt(i);
    }
    return result;
  }

  //method to check the output of both method
  public static boolean isCompareString(char[] str1, char[] str2) {

    for (int i = 0; i < str2.length; i++) {
      if (str1[i] != str2[i]) {
        return false;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //take input of string
    System.out.print("Enter a string ");
    String str = sc.next();

    //char array for storing the result of string to charac
    char[] result = inputString(str);
    char[] result2 = str.toCharArray();
    if (isCompareString(result, result2)) {
      System.out.println("Both Method will give same output.");
    } else {
      System.out.println("output is not same.");
    }

  }
}
