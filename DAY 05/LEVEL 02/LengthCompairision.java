import java.util.*;

public class LengthCompairision {
  // method to find the length of string
  public static int Length(String str) {
    int i = 0;
    try {
      while (true) {
        char ch = str.charAt(i);
        i++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Giving an error");
    }
    return i;
  }

  // method to find same length woart
  public static boolean isLengthSame(int length1, int length2) {
    return length1 == length2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string here");
    String str = sc.next();
    int result = Length(str);
    int result2 = str.length();
    if (isLengthSame(result, result2)) {
      System.out.println("Both method gives the same output ");
    } else {
      System.out.println("Both method gives the different answer");
    }
    sc.close();
  }
}
