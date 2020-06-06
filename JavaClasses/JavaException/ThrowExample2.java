package JavaException;

public class ThrowExample2 {
 static void checkAge(int age) {
	 if(age < 18) {
		 throw new ArithmeticException("Access denied - you must be at least 18 years old");
	 }
	 else {
		 System.out.println("Access granted- you are old enough!");
	 }
 }
 
 public static void main(String[] args) {
	 checkAge(20);
 }
}

//If the age is 20 we will not get an exception
