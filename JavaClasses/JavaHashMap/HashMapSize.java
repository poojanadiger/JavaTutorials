package JavaHashMap;

import java.util.HashMap;
public class HashMapSize {
 public static void main(String[] args) {
	 HashMap<String,String> capitalCities = new HashMap<String, String>();
	 capitalCities.put("England", "London");
	 capitalCities.put("Germany", "Berlin");
	 capitalCities.put("Norway", "Oslon");
	 capitalCities.put("USA", "Washington Dc");
	 
	 System.out.println(capitalCities.size());
 }
}
