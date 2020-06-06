package JavaArrayList;
import java.util.ArrayList;
public class ForEachLoop {
 public static void main(String[] args) {
	 ArrayList<String> cars = new ArrayList<String>();
	 cars.add("Volvo");
	 cars.add("BMW");
	 cars.add("Ford");
	 cars.add("Mazda");
	 for(String i:cars) {
		 System.out.println(i);
	 }
 }
}

//You can also loop through an ArrayList with the for each loop.