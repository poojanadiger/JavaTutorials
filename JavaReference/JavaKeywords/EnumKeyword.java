package JavaKeywords;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}
public class EnumKeyword {
 public static void main(String[] args) {
	 Level myVar = Level.MEDIUM;
	 System.out.println(myVar);
 }
}

//Create an enum with constants(unchangeable variables):
//you can access enum constants with the dot syntax.

/*
 * The enum keyword declares an enumerated unchangeable type.
 * An enum is a special class that represents a group of constants.
 * To create an enum, use the enum keyword and separate the constants with a comma.
 * Note: they should be upper case letters. 
 */
