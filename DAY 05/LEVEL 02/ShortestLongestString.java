import java.util.Scanner;

public class ShortestLongestString {
  public static int findLengthOfString(String string) {
    // variable which hold the length value
    int count = 0;
    int i = 0;

    try {

      // loop is break when exception is thrown
      while (true) {
        string.charAt(i);
        i++;
        count++;
      }
    } catch (Exception e) {
      return count;
    }

  }

  public static String[] splitText(String string) {

    int wordCount = 1;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' ') {
        wordCount++;
      }
    }

    // array for storing the words
    String[] words = new String[wordCount];

    // extract words from the string
    int start = 0, wortIndex = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == ' ') {
        words[wortIndex++] = string.substring(start, i);
        start = i + 1;
      }

    }
    // add last wort of the string to the array
    words[wortIndex] = string.substring(start);

    return words;
  }

  public static String[][] wordsNlength(String[] string) {

    String[][] wordNLength = new String[2][string.length];
    for (int i = 0; i < wordNLength[1].length; i++) {
      wordNLength[0][i] = string[i];
      wordNLength[1][i] = String.valueOf(string[i].length());
    }
    return wordNLength;

  }

  // this method find Shortest And Longest String
  public static String[] findShortestAndLongestString(String[][] string) {

    String[] shortAndLongest = new String[2];
    shortAndLongest[0] = string[0][1];
    shortAndLongest[1] = string[1][1];

    // loop for find Shortest and longest string in array;
    for (int i = 0; i < shortAndLongest.length; i++) {

      if (shortAndLongest[0].length() > string[0][i].length()) {
        shortAndLongest[0] = string[0][i];
      }
      if (shortAndLongest[1].length() < string[0][i].length()) {
        shortAndLongest[1] = string[0][i];
      }

    }
    return shortAndLongest;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // take string input form the user
    System.out.print("Enter the text : ");
    String string = input.nextLine();

    // method call to get the length of the string
    int length = findLengthOfString(string);

    // method call to make string text in to array of words
    String[] words = splitText(string);

    String[][] wordNLength = wordsNlength(words);

    String[] shortAndLongest = findShortestAndLongestString(wordNLength);

    // displaying the result of words of string and length of words

    for (int i = 0; i < wordNLength[1].length; i++) {

      System.out.println(wordNLength[0][i] + " : " + wordNLength[1][i]);

    }
    System.out.println("\n");
    System.out.println("Shortest String: " + shortAndLongest[0] + "\nLongest String: " + shortAndLongest[1]);

  }
}
