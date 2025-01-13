import java.util.Scanner;

public class SpringSeason {
	public static boolean isSpringSeason(int month, int day){
		// Check if the date falls within the spring season
		boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
			(month == 4 && day >= 1 && day <= 30) ||
			(month == 5 && day >= 1 && day <= 31) ||
			(month == 6 && day >= 1 && day <= 20);
			
		//return true if it is a spring otherwise false
		if (isSpring) {
		  return true;
		} else {
		  return false;
    }
	}
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // taking user input of month and day
    System.out.print("Enter Month : ");
    int month = input.nextInt();
    System.out.print("Enter day : ");
    int day = input.nextInt();
	
    //displaying the result and directly call the method in condition statement
	if (isSpringSeason(month,day)) {
      System.out.println("It's a Spring Season");
    } else {
      System.out.println("Not a Spring Season");
    }

    input.close();
  }
}