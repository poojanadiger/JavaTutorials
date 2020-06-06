package JavaHashMap;
import java.util.HashMap;
public class LoopThroughAnHashMap {
 public static void main(String[] args) {
	 HashMap<String,String> capitalCities = new HashMap<String, String>();
	 capitalCities.put("England","London");
	 capitalCities.put("Germany","Berlin");
	 capitalCities.put("Norway","Oslo");
	 capitalCities.put("USA","WashingtonDC");
	 
	 for(String i: capitalCities.keySet()) {
		 System.out.println(i);
	 }
 }
}
//Loop through the items of a HashMap with a for each loop
//Use the keySet() method if you want only the keys, and use the values() method if you
//only want the values.
