import java.util.Scanner;

public class SplitString {

  // method to split string in words and store in array
  public static String[] splitString(String string) {
    int wordCount = 1;

    // Create an array to store the words
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' ') {
        wordCount++;
      }
    }

    // array for storing the words
    String[] words = new String[wordCount];

    // Extract words from the string
    int start = 0, wordIndex = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' ') {
        words[wordIndex++] = string.substring(start, i);
        start = i + 1;
      }
    }

    // Add the last word
    words[wordIndex] = string.substring(start);
    return words;
  }

  // method to compare the built-in string and custom string array and return
  // boolean value
  public static boolean compareString(String[] string, String[] string2) {
    for (int i = 0; i < string2.length; i++) {
      if (!string[i].equals(string2[i])) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // take input of string from the user
    System.out.print("Enter a text : ");
    String string = input.nextLine();

    // split the string with built in Split method
    String[] builtInSplit = string.split(" ");

    // split the string with custom method and store the result in customSplit array
    String[] customSplit = splitString(string);


    boolean isStringArraySame = (compareString(customSplit, builtInSplit));

    // check the customSplit method and builtInSplit return same result or not
    // and display the
    if (isStringArraySame) {

      System.out.println("Both String array is same.\n");

    } else {
      System.out.println("String array is not same!");
    }

    // print the built-in result
    System.out.println("built in split with split method----");
    for (String word : builtInSplit) {
      System.out.println(word);
    }

    // print the custom result
    System.out.println("custom Split without split method----");
    for (String word : customSplit) {
      System.out.println(word);
    }
  }
}
