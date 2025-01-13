import java.util.Scanner;

public class AthleteRounds {
	public static double athleteRound(double side1, double side2, double side3){
		// Calculate perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Calculate number of rounds needed to complete 5 km
        double rounds = 5000 / perimeter;
		return rounds;
	}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input for the sides of the triangle
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();
        
		//storing the function return value in result
        double result = athleteRound(side1,side2,side3);
        
        //Output the result
        System.out.println("The total number of rounds the athlete will run is " + result);

        input.close();
    }
}