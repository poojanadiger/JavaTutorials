package JavaHashMap;
import java.util.HashMap;
public class AccessAnItem {
	
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities.get("England"));
	}

}

//To access a value in the HashMap, use the get() method and refer to its key
