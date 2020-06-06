package JavaStringMethods;

public class ContentEqualsMethod {
 public static void main(String[] args) {
	 String myStr = "Hello";
	 System.out.println(myStr.contentEquals("Hello"));
	 System.out.println(myStr.contentEquals("e"));
	 System.out.println(myStr.contentEquals("Hi"));
 }
}

//Find out if a string contains a sequence of characters.
//The contentEquals() method searches a string to find out if it contains the
//exact same sequence of characters in the specified string or string buffer.
//Returns true if the characters exist and false if not.

//Syntax
//There are 2 contentEquals() methods:
//public boolean contentEquals(String Buffer chars)
//public boolean contentEquals(CharSequence chars)

//Parameter Values
//StringBufferChars The StringBuffer to be searched for.
//CharSequence chars The sequence of characters to be searched for.

/*
 * Returns A boolean, indicating whether the exact same sequence of characters
 * exist in the specified string or string buffer.
 * true: sequence of characters exists.
 * false: sequence of characters do not exist.
 *
 */ 
