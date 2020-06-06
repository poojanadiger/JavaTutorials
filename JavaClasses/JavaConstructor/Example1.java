package JavaConstructor;

public class Example1 {
 int  x;
  //Create a class constructor for the MyClass class
 public Example1() {
	 x = 5;
 }
 
 public static void main(String[] args) {
	 Example1 myObj = new Example1();
	 System.out.println(myObj.x);
	 System.out.println("A constructor in Java is a special method that is used to initialize objects.");
	 System.out.println(" The constructor is called when an object of a class is created.");
	 System.out.println("It can be used to set initial values for object attributes");
	 System.out.println("Note that the constructor name must match the class name, and it can not have a return type");
 }
}
