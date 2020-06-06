package JavaStringMethods;

public class CodePointCountEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 int result = myStr.codePointCount(0, 5);
	 System.out.println(result);
 }
}

/*
 * Return the number of unicode values found in a string.
 * The codePointCount() method returns the number of unicode values found in a string.
 * Use the startIndex and endIndex parameters to specify where to begin and end the search.
 * The index of the first character is 0, the second character is 1, so on.
 * 
 * Syntax: 
 * public int codePointCount(int startIndex, int endIndex)
 * 
 * Parameter values:
 * startIndex An int value, representing the index to the first character in the string.
 * endIndex An int value, representing the index after the last character in the string.
 * 
 * Technical Details:
 * returns: An int value, representing the number of unicode values found in a string.
 * throws: IndexOutOfBoundsException - if startIndex is negative, or endindex is larger that
 * the length of the string, or startIndex is larger than endIndex.
 * 
 */
