package JavaClassAttributes;

public class OverrideAttributes {
 int x = 10;
 
 public static void main(String[] args) {
	 OverrideAttributes myObj = new OverrideAttributes();
	 myObj.x = 25;//x is now 25
	 System.out.println(myObj.x);
	 System.out.println("Change the value of x to 25");
 }
}
