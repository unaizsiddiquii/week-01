import java.util.Scanner;
public class HandleArrayIndexOutOfBound{
	
	//method for generating exception
	public static void generateException(String[] names){
		names[6]  = "Payal";
		for(int i = 0 ; i <= names.length; i++){
			System.out.println(": "+names[i]);
		}
	}
	
	//method for handling exception
	public static void handleException(String[] names){
		try{
			generateException(names);
		}catch(Exception e){
			for(int i = 0 ; i < names.length; i++){
				System.out.println(": "+names[i]);
			}
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Defining string array to store names
		String[] names = new String[5];
		
		//loop to take user input and store in array
		for(int i = 0 ; i < names.length; i++){
			System.out.print("Enter a string: ");
			names[i] = input.next();
			
		}
		
		//try catch block to handle the exception
		try{
			generateException(names);
		}catch(Exception e){
			System.out.println("Exception : "+e);
		}
		System.out.println("---Handling---");
		
		//method call to handle the exception
		handleException(names);
		
		input.close();
		
	}
}