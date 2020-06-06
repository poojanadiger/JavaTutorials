package JavaStringMethods;

public class CopyValueOfEx {
   public static void main(String[] args) {
	   char[] myStr1 = {'H','e','l','l','otindertin'};
	   String myStr2 = "";
	   myStr2 = myStr2.copyValueOf(myStr1,0,5);
	   System.out.println("Returned String: " +myStr2);
   }
}

/*
 * Return a String that represents certain characters of a char array.
 * The copyValueOf() method returns a String that represents the characters of 
 * a char array.
 * This method returns a new String array and copies the characters into it.
 * 
 * Syntax:
 * public static String copyValueOf(char[] data, int offset, int count)
 * 
 * Parameter Values:
 * data : A char array.
 * offSet: An int value, representing the start index of the char array.
 * count: An int value, representing the length of the char array.
 * 
 * Technical Details
 * Returns: A String, representing the characters of the char array.
 * throws: StringIndexOutOfBoundsException - if offset is negative or out
 * of reach, or is count is greater than the length of the char array, or negative.
 * 
 * 
 */
