package JavaStringMethods;

public class LastIndexOfEx {
 public static void main(String[] args) {
	 String myStr = "Hello planet earth, you are a great planet.";
	 System.out.println(myStr.lastIndexOf("planet"));
 }
}

/**
 * Searce last occurrence of "planet".
 * 
 * Definition and Usage
 * The lastIndexOf() method returns the position of the last occurrence of specified
 * characters in a string.
 * Tips: Use the indexOf method to return the position of the first occurrence of
 * specified characters in a string.
 * 
 * Syntax
 * There are 4 lastIndexOf() methods:
 * public int lastIndexOf(String str)
 * public int lastIndexOf(String str, int fromIndex)
 * public int lastIndexOf(int char)
 * public int lastIndexOf(int char, int fromIndex)
 * 
 * Technical Details
 * Returns 
 * An int value, representing the index of the first occurrence of the character
 * in the string, or -1 if it never occurs.
 */
