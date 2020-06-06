package JavaStringMethods;

public class codePointBeforeMethodEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 int result = myStr.codePointBefore(1);
	 System.out.println(result);
 }
}

/*
 * Return the unicode of the first character in a string(the unicode value of H is 72)
 * The codePointBefore method returns the unicode value of the character before
 * the specified index in a string.
 * The index of the first character is 1, the second character is 2, and so on.
 * Note: the value 0 will generate an error, as this is negative number(out of reach).
 * The value 0 will generate an error, as this is a negative number(out of reach).
 * 
 * public int codePointBefore(int index)
 * 
 * index An int value, representing the index following the unicode that should be returned.
 * returns: An int value, representing the unicode value before the specified index.
 * throws: IndexOutOfBoundsException: if index is negative or not less than the
 * length of the specified string.
 */
