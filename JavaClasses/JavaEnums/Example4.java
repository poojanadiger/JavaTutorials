package JavaEnums;
enum Level{
	 LOW,
	 MEDIUM,
	 HIGH
}
public class Example4 {

	 public static void main(String[] args) {
		 for(Level myVar : Level.values()) {
			 System.out.println(myVar);
		 }
	 }
 }
