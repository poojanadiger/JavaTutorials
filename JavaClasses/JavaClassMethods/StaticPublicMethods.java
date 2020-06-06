package JavaClassMethods;

public class StaticPublicMethods {
 static void myStaticMethod(){
	System.out.println("Static methods can be called without creating objects");
}
 
 //public method
 public void myPublicMethod() {
	 System.out.println("Public methods must be called by creating objects");
 }
 
 //Main Method
 public static void main(String[] args) {
	 myStaticMethod(); //call the static method
	 
	 StaticPublicMethods myObj = new StaticPublicMethods();//Create an object of MyClass
	 myObj.myPublicMethod(); //Call the public method
	 
 }
}