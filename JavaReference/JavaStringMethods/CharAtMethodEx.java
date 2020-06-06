package JavaStringMethods;

public class CharAtMethodEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 char result = myStr.charAt(0);
	 System.out.println(result);
 }
}

//Return the first character (0) of a string.
/*
 * The charAt() method returns the character at the specified index in a string.
 * The index of the first character is 0, the second character is 1 and so on.
 * syntax: public char charAt(int idex)
 * index: An int value representing the index of the character to return.
 * Returns: A char value a the specified index of this string.
 *          The first char value is at index 0.
 * Throws:  IndexOutofBoundsException - if index is negative or not less than the
 * length of the specified string.
 */
