package JavaMethodParameters;

public class Example3 {
 //Create a checkAge() method with an integer parameter called age
	static void checkAge(int age) {
		if(age < 18) {
		//If age is less than 18, print "access denied"
		System.out.println("Access denied - you are not old enough!");
	}
		//If age is greater than 18, print "access granted"
		else {
			System.out.println("Access granted - you are old enough!");
		}
		
	}
	
	public static void main(String[] args) {
		checkAge(20); //Call the checkAge method and pass along an age of 20
	}
}
