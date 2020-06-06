package JavaArrayList;
import java.util.ArrayList;
public class LoopthroughArray {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}
 
}

/*
 * Loop through the elements of an ArrayList with a for loop, and use the Size()  method
 * to specify how many times the loop should run.
 */
