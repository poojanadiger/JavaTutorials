package JavaArrayList;
import java.util.ArrayList;
public class AddItems {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
	}

}

//The ArrayList class is a resizable array, which can be found in the java.util package.
//The difference between a built in array and an ArrayList in java, is that the size of an arry
//cannot be modified.
//While elements can be added and removed from an ArrayList whenever we want.
