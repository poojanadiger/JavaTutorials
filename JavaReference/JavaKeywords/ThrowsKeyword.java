package JavaKeywords;

public class ThrowsKeyword {
 static void checkAge(int age) throws ArithmeticException{
	 if(age < 18) {
		 throw new ArithmeticException("Access denied - you must be atlest 18 years old.");
		 
	 }else {
		 System.out.println("Access granted - you are old enough!");
	 }
 }
 
 public static void main(String[] args) {
	 checkAge(15);
 }
}
/*
 * The throws keyword indicates what exception type may be thrown by a method.
 * There are many exception types available in Java.
 * 
 *  Used to indicate what exception type may be thrown by a method.
 *  Can declare multiple exceptions.
 *  throws is followed by a class.
 *  and used with the method signature.
 */
