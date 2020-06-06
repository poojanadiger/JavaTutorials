package JavaArrayList;
import java.util.ArrayList;
public class ClearArray {

	public static void main(String[] args) {
		ArrayList<String>cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.clear();
		System.out.println(cars);
	}
}
//To remove all the elements in the ArrayList use the clear() method.