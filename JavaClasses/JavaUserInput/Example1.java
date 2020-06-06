package JavaUserInput;
import java.util.Scanner;//import the scanner class
public class Example1 {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		//Enter username and press Enter
		System.out.println("Enter username");
		userName = myObj.nextLine();
		
		System.out.println("Username is: "+ userName);
		
	}
 
}
 

//The scanner class is used to get user input, and it is found in the java.util package.

//To use the scanner class, create an object of the class and use any of the available methods found in the

//scanner class documentation.