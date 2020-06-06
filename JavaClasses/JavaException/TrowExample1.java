package JavaException;


public class TrowExample1 {
 static void checkAge(int age) {
	 if(age < 18) {
		 throw new ArithmeticException("Access denied- you must be at least 18 years old");
	 }
	 else {
		 System.out.println("Access granted - You are old enough");
	 }
 }
 
 public static void main(String[] args) {
	 checkAge(15);
 }
}

/*
 * The throw statement allows us to create a custom error.
 * the throw statement is used together with an exception type.
 * There are many exception types available in java
 * 
 * Arithmetic Exception
 * FileNOtFoundException
 * ArrayIndexOutOfBoundsException
 * SecurityException
*/
