import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // input of height and weight
    System.out.print("Enter the height :");
    double height = input.nextDouble();

    System.out.print("Enter the weight :");
    double weight = input.nextDouble();

    double bmi = weight / (height * height);

    // Determine weight status based on BMI
    if (bmi <= 18.4) {
      System.out.println("BMI is " + bmi + " -- Underweight");
    } else if (bmi >= 18.5 && bmi < 24.9) {
      System.out.println("BMI is " + bmi + " -- Normal");

    } else if (bmi >= 25 && bmi < 29.9) {
      System.out.println("BMI is " + bmi + " -- Overweight");

    } else {
      System.out.println("BMI is " + bmi + " -- Obese");

    }
  }

}
