package JavaHashMap;
import java.util.HashMap;
public class RemoveAnItemEx {
 public static void main(String[] args) {
	 HashMap<String, String> capitalCities = new HashMap<String, String>();
	 capitalCities.put("England", "London");
	 capitalCities.put("Germany", "Berlin");
	 capitalCities.put("Norway", "Oslo");
	 capitalCities.remove("England");
	 System.out.println(capitalCities);
 }
	
}
