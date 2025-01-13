import java.util.Scanner;

public class YoungestTallestFriends {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] ageAndheight = new int[3][3];
    int youngest = Integer.MAX_VALUE;
    int tallest = Integer.MIN_VALUE;

    // getting input from the user of age and height
    for (int i = 0; i < ageAndheight.length; i++) {
      System.out.println("Enter the age : ");
      ageAndheight[0][i] = input.nextInt();
      System.out.println("Enter the Height : ");
      ageAndheight[1][i] = input.nextInt();

    }
    // finding youngest friend in this loop
    for (int i = 0; i < 3; i++) {
      if (ageAndheight[0][i] < youngest) {
        youngest = ageAndheight[0][i];
      }
    }
    // finding tallest friend in this loop
    for (int i = 0; i < 3; i++) {
      if (ageAndheight[1][i] > tallest) {
        tallest = ageAndheight[1][i];
      }
    }

    System.out.println(" the youngest age of the 3 friend " + youngest);
    System.out.println(" the tallest of the 3 friend " + tallest);

  }
}