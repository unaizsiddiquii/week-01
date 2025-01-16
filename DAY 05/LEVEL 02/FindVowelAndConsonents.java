import java.util.Scanner;

public class FindVowelAndConsonents {

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

  // find the Vowels And Consonants and return a 2d array
  public static String[][] findVowelsAndConsonants(String string) {
    String[][] result = new String[string.length()][2];
    int index = 0;

    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);

      if (ch == ' ' || !((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
        continue; // Skip spaces and non-alphabetic characters
      }

      result[index][0] = String.valueOf(ch);
      if ("AEIOUaeiou".indexOf(ch) != -1) {
        result[index][1] = "Vowel";
      } else {
        result[index][1] = "Consonant";
      }
      index++;
    }

    // Resize the array to remove null rows (if any)
    String[][] finalResult = new String[index][2];
    for (int i = 0; i < index; i++) {
      finalResult[i] = result[i];
    }

    return finalResult;
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

    // print vowel and consonants
    String[][] vowelsAndConsonants = findVowelsAndConsonants(upperCaseString);
    System.out.println("\nCharacter Classification:");
    for (String[] row : vowelsAndConsonants) {
      System.out.println(row[0] + " : " + row[1]);
    }
  }
}
