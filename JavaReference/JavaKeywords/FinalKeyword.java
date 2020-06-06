package JavaKeywords;

public class FinalKeyword {
	 final int x = 10;
	 public static void main(String[] args) {
		 FinalKeyword myObj = new FinalKeyword();
		 myObj.x = 25; // will generate an error
		 System.out.println(myObj.x);
	 }
}

/*
 * The final keyword is a non-access modifier used for classes, attributes and methods, which makes
 * them non-changeable(impossible to inherit or override).
 * the final keyword is useful when you want a variable to always store the same value.
 * the final keyword is called a modifier.  
 */
