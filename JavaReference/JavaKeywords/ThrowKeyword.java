package JavaKeywords;

public class ThrowKeyword {
 static void checkAge(int age) {
	 if(age < 18) {
		  throw new ArithmeticException("Access denied- you must be atleast 18.");
	 } else {
		 System.out.println("Access granted- you are old enough!");
	 }
 }
 
 public static void main(String[] args) {
	 checkAge(15);
 }
}

/*
 * The throw keyword is used to create a custom error.
 * The throw statement is used together with an exception type.
 * There are many exception types available in Java
 * Arithmetic exception
 * Classnotfound exception
 * ArrayIndexOutofBound exception
 * Security exception
 * 
 * The exception type is often used together with a custom method.
 * Used to throw an exception for a method.
 * Can not throw multiple exceptions.
 * throw is followed by an object(new type)
 * used inside the method.
 * 
 */
