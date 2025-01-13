//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM.

public class StudentMarks{
	public static void main(String[] args){
		// PCM marks of student
		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		
		//average calculating
		double average = (maths + physics + chemistry) / 3.0;
		
		//printing average of PCM marks
		System.out.print("Sam’s average mark in PCM is "+average);
		
	}
}