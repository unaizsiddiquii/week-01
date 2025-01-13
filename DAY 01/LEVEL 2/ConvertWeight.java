import java.util.Scanner;

public class ConvertWeight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the weight in pounds : ");
    double weight = input.nextDouble();

    // converting pound to kilograms
    double poundTokg = weight * 2.20462;

    System.out.println("The weight of the person in pound is " + weight + " and in kg is " + poundTokg);
    input.close();
  }
}
