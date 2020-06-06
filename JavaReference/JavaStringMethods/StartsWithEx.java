package JavaStringMethods;

public class StartsWithEx {
 public static void main(String[] args) {
	 String myStr ="Hello";
	 System.out.println(myStr.startsWith("Hel"));
	 System.out.println(myStr.startsWith("llo"));
	 System.out.println(myStr.startsWith("o"));
 }
}

/**
 * Find out if the string starts with the specified characters.
 * 
 * Definition and Usage
 * The startsWith() method checks whether a string starts with the specified character(s).
 * Tip: Use the endsWith() method to check whether a string ends with the
 * specified characters.
 * 
 * Syntax
 * public boolean startsWith(String chars)
 * 
 * Parameter Values
 * chars A String, representing the characters(s) to check for.
 * 
 * Technical Details
 * Returns: A boolean value.
 *          true-if the string starts with the specified characters(s).
 *          false- if the string does not start with the specified character(s).
 */
