package JavaStringMethods;

public class TrimEx {
 public static void main(String[] args) {
	 String myStr = "    Hello World!   ";
	 System.out.println(myStr);
	 System.out.println(myStr.trim());
 }
}
/**
 * Remove whitespace from both sides of a string.
 * 
 * Definition and Usage
 * The trim() method removes whitespace from both ends of string.
 * Note: This method does not change the original string.
 * 
 * Syntax
 * public string trim()
 * 
 * Parameters
 * None.
 * 
 * Technical Details
 * Returns: A String value, which is a copy of the string, without
 * leading and trailing whitespace.
 * 
 * 
 */
