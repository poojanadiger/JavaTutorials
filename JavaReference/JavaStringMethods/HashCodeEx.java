package JavaStringMethods;

public class HashCodeEx {
  public static void main(String[] args) {
	 String myStr = "Hello";
	 System.out.println(myStr.hashCode());
 }
}
/*
 * Returns the hash code of a string.
 * 
 * Definition and Usage
 * The hashCode() method returns the hash code of a string.
 * The hash code for a string object is computed like this:
 * s[0]*31^(n-1) + s[1]*31^(n-2) + ...+ s[n-1]
 * 
 * where s[i] is the ith character of the string, n is the length of the
 * string, and ^indicates exponentiation.
 * 
 * Syntax
 * public int hashCode()
 * 
 * Parameter Values
 * 
 * 
 * */
