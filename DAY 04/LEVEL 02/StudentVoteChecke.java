import java.util.Scanner;
public class StudentVoteChecke{
	
	//method for checking vote eligibility
	public static boolean canStudentVote(int age){
		
		//condition to check vote 
		if(age >= 18){
			return true;
		}else if(age <= 0){
			return false;
		}else{
			return false;
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking user input of 10 student age  and store into age array
		int[] age = new int[10];
		for(int i = 0 ; i < age.length ; i++){
			System.out.print("Enter age: ");
			age[i] = input.nextInt();
			
		}
		//loop used to call function and displaying the result
		for(int i = 0 ; i < age.length ; i++){
			
			boolean vote = canStudentVote(age[i]);
			if(vote == true){
				System.out.println("Student can vote with age : "+age[i]);
			}else{
				System.out.println("Student cannot vote with age : "+age[i]);
			}
		}
		//closing the input
		input.close();
		
	}
}