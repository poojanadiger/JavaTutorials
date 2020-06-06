package JavaException;

public class Example1 {
 public static void main(String[] args) {
	 int[] myNumbers = {1,2,3};
	 System.out.println(myNumbers[10]);
  
 }
}

//This will generate an error, because myNumbers[10] does not exist.

/*
 * When executing java code, different errors can occur: coding errors made by the programmer,
 * errors due to wrong input, or other unforeseeable things.
 * When an error occurs, java will normally stop and generate an error message.
 * The technical term for this is: java will throw an exception(Throw an error). 
 * */
 