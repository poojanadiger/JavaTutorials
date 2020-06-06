package JavaArrayList;
import java.util.ArrayList;
public class ArrayListInt {
 public static void main(String[] args) {
	 ArrayList<Integer>myNumbers = new ArrayList<Integer>();
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
 * Elemetns in an ArrayList are actually objects. In the example above, we created elements
 * of type string. Remember that a string in java is an object.
 * To use other types, such an int, you must specify an equivalent wrapper class
 * Integer
 * For other primitive types, use boolean , character for char, Double for double etc 
 */
