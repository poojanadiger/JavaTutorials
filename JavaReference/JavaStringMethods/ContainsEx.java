package JavaStringMethods;

public class ContainsEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 System.out.println(myStr.contains("Hel"));
	 System.out.println(myStr.contains("e"));
	 System.out.println(myStr.contains("Hi"));
 }
}

/*
 * Find out if a string contains a sequence of characters.
 * The contains() method checks whether a string contains a sequence of characters.
 * Returns true if the characters exist and false if not.
 * 
 * Syntax
 * public boolean contains(CharSequence chars)
 * 
 * Parameter Values
 * Parameter: CharSequence chars - The character to be searched for.
 * 
 * Returns: A boolean, indicating whether a sequence of characters exist in the specified string:
 * true - sequence of characters exists
 * false - sequence of characters do not exist.
 * 
 * throws: NullPointerException - if the returned value is null.
 */
