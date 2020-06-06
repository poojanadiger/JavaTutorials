package JavaStringMethods;

public class CodePointAtMethodEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 int result = myStr.codePointAt(0);
	 System.out.println(result);
 }
}

/*
 * Return the unicode of the first character in a string(the unicode value of "H" is 72).
 * The codePointAt() method returns the unicode value of the character at the
 * specified index in a string.
 * The index of the first character is 0, the second character is 1, and so on.
 * 
 *  public int codePointAt(int index)
 *  index An int value, representing the index of the character to return.
 *  returns: An int value, representing the unicode value of character at index.
 *  throws: IndexOutOfBoundsException- If index is negative or not less than the
 *  length of the specified string.
 */
