package JavaArrayList;

import java.util.ArrayList;
public class ChangeAnItem {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mazda");
		cars.set(0, "Opel");
		System.out.println(cars);
	}

}

//To modify an element, use the set() method and refer to the index number.
