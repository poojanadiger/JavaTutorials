package JavaConstructor;

public class Example2 {
 int x;
 
 public Example2(int y) {
	 x = y;
 }
 
 public static void main(String[] args) {
	 Example2 myObj = new Example2(115);
	 System.out.println(myObj.x);
	 System.out.println("COnstrucotrs can also take parameters which is used to initialize attributes");
	 
 }
}
