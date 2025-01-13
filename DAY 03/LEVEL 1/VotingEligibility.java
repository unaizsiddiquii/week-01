import java.util.Scanner;
public class VotingEligibility{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//declaring array of student of size 10;
		int age[] = new int[10];
		
		//taking input of 10 student age
		for(int i = 0; i < age.length ; i++){
			System.out.print("Enter the age of student"+(i+1)+": " );
			age[i] = input.nextInt();
		}
		
		System.out.println("\n");
		
		//displaying the result according to condition
		for(int i = 0 ; i  < age.length; i++){
			
			if(age[i] < 0 ){
				System.out.println("invalid age "+age[i]);
			}else if(age[i] >= 18){
				System.out.println("The student with the age "+age[i]+" can vote.");
			}else{
				System.out.println("The student with the age "+age[i]+" cannot vote.");
			}
		}
		input.close();

	}
}