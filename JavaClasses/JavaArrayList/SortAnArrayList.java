package JavaArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {
 public static void main(String[] args) {
	 ArrayList<String> cars = new ArrayList<String>();
	 cars.add("Volvo");
	 cars.add("BMW");
	 cars.add("Ford");
	 cars.add("Mazda");
	 
	 Collections.sort(cars); //Sort cars
	 for(String i:cars) {
		 System.out.println(i);
	 }
 }
}

/*
 * Another useful class in the java.util package is the collections class, which
 * includes the sort() method for sorthing lists alphabetically or numerically
 */
