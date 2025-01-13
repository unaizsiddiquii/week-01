import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // checking which number is the largest using if-else
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? true");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? false");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? true");
            System.out.println("Is the third number the largest? false");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? true");
        } else {
            
            System.out.println("no single largest number");
        }
        input.close();
    }
}
