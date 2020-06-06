package JavaException;

public class FinallyExample {
 public static void main(String[] args) {
	 try {
		 int[] myNumbers = {1,2,3};
		 System.out.println(myNumbers[10]);
	 }
	 catch(Exception e) {
		 System.out.println("Something went wrong");
	 }
	 finally {
		 System.out.println("The try catch is finished");
	 }
 }
}

//The finally statement lets you execute code, after try catch, regardless of the result.