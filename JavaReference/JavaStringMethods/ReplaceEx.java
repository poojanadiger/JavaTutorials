package JavaStringMethods;

public class ReplaceEx {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 System.out.println(myStr.replace('l', 'p'));
 }
}

/**
 * Returns a new string where all "I" characters are replaced with "p" characters.
 * 
 * Definition and Usage
 * The replace() method searches a string for a specified character, and 
 * returns a new string where the specified characters are replace.
 * 
 * Syntax
 * public String replace(char searchChar, char newChar)
 * 
 * Parameter Values
 * searchChar A char, representing the character that will be replaced by the new character
 * newChar A char, representing the character to replace the searchChar with
 * 
 * Technical Details
 * Returns A new String, where the specified character has been replaced by the
 * new characters.
 */
