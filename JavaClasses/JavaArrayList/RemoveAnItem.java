package JavaArrayList;
import java.util.ArrayList;
public class RemoveAnItem {
 public static void main(String[] args) {
	 ArrayList<String>cars = new ArrayList<String>();
	 cars.add("Volvo");
	 cars.add("BMW");
	 cars.add("FORD");
	 cars.add("Mazda");
	 cars.remove(0);
	 System.out.println(cars);
 }
}
//To remove an element, use the remove() method and refer to the index number.