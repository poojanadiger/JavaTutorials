package JavaEnums;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}
public class Example1 {
 public static void main(String[] args) {
	 Level myVar = Level.MEDIUM;
	 System.out.println(myVar);
 }
}


//An enum is a special "class" that represents a group of constants(unchangeable variable, like final variables).

//To create an enum, use the enum keyword (instead of class or interface), and 

//Separate the constants with a comma.

//Note that they should be in upper case letters:

//You can access enum constants with dot syntax

//Enum is short for "enumerations", which means "specifically listed".