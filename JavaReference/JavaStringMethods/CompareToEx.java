package JavaStringMethods;

public class CompareToEx {
 public static void main(String[] args) {
	 String myStr1 = "Hello";
	 String myStr2 = "Hello";
	 System.out.println(myStr1.compareTo(myStr2));
	 //Returns 0 because they are equal
 }
}
/*
 * Compare two strings.
 * The compareTo() method compares two strings lexicographically.
 * The comparison is based on the Unicode value of each character in the strings.
 * The method returns 0 if the string is equal to the other string.
 * A value less than 0 is returned if the string is less than the other string.(less characters) and
 * a value greater than 0 if the string is greater than the other string(more characters).
 * 
 * Tips: use compareToIgnoreCase() to compare two strings lexicographyically,
 * ignoring lower case and upper case differences.
 * Tips: Use the equals() method to compare two strings without consideration of unicode values.
 * Tips: Use the equlas() method to compare two strings without consideration of unicode values.
 * 
 * public int compareTo(String string2)
 * public int compareTo(Object object)
 * 
 * string2: A String, representing the other string to be compared.
 * object: An object, representing an object to be compared.
 * 
 * returns: An int value: 0 if the string is equal to the other string.
 *          < 0 if the string is lexicographically less than the other string.
 *          >0 if the string is lexicographically greater than the other string(more characters)
 *          
 * */
