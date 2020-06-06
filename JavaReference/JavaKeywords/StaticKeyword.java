package JavaKeywords;

public class StaticKeyword {
 
	//Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	
	}
	
	//Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}
	
	//Main method
	public static void main(String[] args) {
		myStaticMethod(); //call the static method
		
		StaticKeyword myObj = new StaticKeyword(); //Create an object of MyClass
		myObj.myPublicMethod(); //call the public method
	}
}
//A static method means that it can be accessed without creating an object of the class, unlike public.
//The static keyword is a non-access modifier used for methods and attributes.
//Static method/attributes can be accessed without creating an object of a class.




