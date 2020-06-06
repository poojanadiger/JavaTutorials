package JavaKeywords;

class Vehicle{
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Tuut,tuut!");
	}
}

public class ExtendKeyword extends Vehicle {
	private String modelName = "Mustang";
	public static void main(String[] args) {
		ExtendKeyword myFastCar = new ExtendKeyword();
		myFastCar.honk();
		System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	}

}

/*
 * The extends keyword extends a class.
 * In java, it is possible to inherit attributes and methods from one class to another.
 * We group the inheritance into two categories.
 * Subclass- child the class that inherits from another class.
 * superclass-parent the class being inherited from
 * 
 * to inherit from a class, use the extends keyword.
 *  
 */
