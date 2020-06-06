package JavaModifiers;

public class Static {
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
		
		Static myObj = new Static(); //Create an object of MyClass
		myObj.myPublicMethod(); //call the public method
		
	}
}
