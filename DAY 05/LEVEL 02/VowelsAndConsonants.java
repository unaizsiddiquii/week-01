import java.util.Scanner;

public class VowelsAndConsonants {
  // method to count the vowels and consonants in the string
  public static int[] countVowelsAndConsonants(String string) {
    int[] count = new int[2];
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      if (('A' == ch) || ('E' == ch) || ('I' == ch) || ('O' == ch) || ('U' == ch)) {
        count[0]++;
      } else {
        count[1]++;
      }
    }
    return count;

  }

  // method to check and return Vowel, Consonant, or Not a Letter

  public static void checkLetter(String string) {
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);

      if (ch == ' ') {
        continue; // Skip spaces
      } else if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
        System.out.println(ch + " : Not a letter");
      } else if ("AEIOUaeiou".indexOf(ch) != -1) {
        System.out.println(ch + " : is VOWEL");
      } else {
        System.out.println(ch + " : is CONSONANT");
      }
    }
  }

  // convert lower case into upper case
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

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // get input from the user
    System.out.print("Enter text : ");
    String string = scanner.nextLine();

    // changing the string into uppercase string
    String upperCaseString = convertToUpperCase(string);

    // method call that check and return Vowel, Consonant, or Not a Letter
    checkLetter(upperCaseString);
    System.out.println("\n");

    // count vowel and consonants an store in count array
    int[] count = countVowelsAndConsonants(upperCaseString);
    System.out.println("Vowel in the string is : " + count[0]);
    System.out.println("Consonants in the string is : " + count[1]);

  }
}
