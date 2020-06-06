package JavaHashMap;
import java.util.HashMap;
public class LoopThroughaHashMapEx2 {
 public static void main(String[] args) {
	 HashMap<String,String> capitalCities = new HashMap<String,String>();
	 capitalCities.put("England", "London");
	 capitalCities.put("Germany", "Berlin");
	 for(String i: capitalCities.keySet()) {
		 System.out.println("Key: "+ i+ "value: "+ capitalCities.get(i));
	 }
 }
}
