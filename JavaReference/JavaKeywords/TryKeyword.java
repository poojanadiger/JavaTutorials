package JavaKeywords;

public class TryKeyword {
 public static void main(String[] args) {
	 try {
		 int[] myNumbers = {1,2,3};
		 System.out.println(myNumbers[10]);
	 }
	 catch(Exception e) {
		 System.out.println("Something went wrong");
	 }
  }
}

//If an error occurs, use try catch to catch the error and execute some code to handle it.
/*
 * The try keyword creates a try catch statement.
 * The try statement allows you to define a block of code to be tested for
 * errors while it is being execute.
 * 
 * The catch statement allows you to define a block to be executed, if an 
 * error occurs in the try block.
 */
