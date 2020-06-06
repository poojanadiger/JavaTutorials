package JavaKeywords;

public class DoKeyWord {
 public static void main(String[] args) {
	 int i = 0;
	 do {
		 System.out.println(i);
		 i++;
	 }
	 while(i<5);
 }
}

/*
 * The following loop will always be executed at least once, even if the condition is false, because
 * the code block is executed before the condition is tested.
 * 
 *  The do keyword is used together with while to create a do-while loop.
 *  The while loop loops through a block of code as long as a specified condition is true.
 *  
 *  The do/While loop is variant of the while loop. This loop will execute the code block once,
 *  before checking if the condition is true, then it will repeat the loop as long as the
 *  condition is true.
 *  
 *  Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
 *
 */
