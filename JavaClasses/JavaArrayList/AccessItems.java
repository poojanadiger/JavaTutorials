package JavaArrayList;

import java.util.ArrayList;

public class AccessItems {
 public static void main(String[] args) {
	 ArrayList<String> cars = new ArrayList<String>();
	 cars.add("Volvo");
	 cars.add("BMW");
	 cars.add("Ford");
	 cars.add("Mazda");
	 System.out.println(cars.get(0));
 }
}
 //To access an element in the ArrayList, use the get() method and refer to the index number.
