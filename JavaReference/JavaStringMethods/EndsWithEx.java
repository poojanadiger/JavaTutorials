package JavaStringMethods;

public class EndsWithEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 System.out.println(myStr.endsWith("Hel"));
	 System.out.println(myStr.endsWith("llo"));
	 System.out.println(myStr.endsWith("o"));
 }
}

/*
 * Find out if the string ends with the specified characters.
 * Definition and Usage
 * The endsWith() method checks whether a string ends with the specified characters.
 * Tip: Use the startsWith() method to check whether a string starts with the
 * specified characters.
 * 
 * Syntax
 * public boolean endsWith(String chars)
 * 
 * Parameter Values
 * chars: A String, representing the characters to check for
 * 
 * Technical Details
 * Returns: A boolean value:
 * true: if the string ends with the specified characters.
 * false: if the string does not end with the specified characters.
 * 
 * */
