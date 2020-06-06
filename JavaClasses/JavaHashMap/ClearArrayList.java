package JavaHashMap;
import java.util.HashMap;

public class ClearArrayList {
 public static void main(String[] args) {
	 HashMap<String,String> capitalCities = new HashMap<String, String>();
	 capitalCities.put("England", "London");
	 capitalCities.put("Germany", "Berlin");
	 capitalCities.put("Norway", "Oslo");
	 capitalCities.clear();
	 System.out.println(capitalCities);
 }
}

//To remove all items, use the clear() method.