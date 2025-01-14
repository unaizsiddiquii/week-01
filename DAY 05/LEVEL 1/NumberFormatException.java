import java.util.Scanner;
import java.lang.Integer;

public class NumberFormatException {

  // method to generate exception
  public static void generateException(String text) {
    int numberInText = Integer.parseInt(text);
    System.out.print("Numbers in thext is " + numberInText);
  }

  // method to handle exception
  public static void handleException(String text) {

    try {
      generateException(text);
    } catch (Exception e) {
      System.out.println("Exception is handled...");
      System.out.println("text... " + text);
    }

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // getting user input
    System.out.print("Enter Text : ");
    String text = input.nextLine();

    // try catch block to show and handle exception
    try {
      generateException(text);

    } catch (Exception e) {
      System.out.println("Exception : " + e);
    }
    System.out.println("---handling---");

    // call method to handle the text
    handleException(text);

  }
}
 