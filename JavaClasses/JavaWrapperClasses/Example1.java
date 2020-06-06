package JavaWrapperClasses;
import java.util.ArrayList;
public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		for(int i: myNumbers) {
			System.out.println(i);
		}
	}

}

/*
 * Wrapper classes provide a way to use primitive data type (int, boolean, etc) as objects.
 * 
 *  The table below shows the primitive type and the equivalent wrapper class.
 *  
 *  Sometimes you must use wrapper classes, for example when working with collection objects,
 *  
 *  such as ArrayList, where primitive types cannot be used(the list can only store objects.
 */
