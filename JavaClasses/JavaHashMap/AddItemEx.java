package JavaHashMap;
import java.util.HashMap;

public class AddItemEx {
	
	public static void main(String[] args) {
		HashMap<String,String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
	}

}

/*
 * A HashMap stores an in item in Key/value pairs, and you can access them by an index of 
 * another type.
 * One object is used as key to another object.
 * 
 *  The HashMap class has many useful methods. For example to add items to it, use
 *  the put() method.
 */
