package JavaKeywords;

class Animal1{
	//superclass(parent)
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal1 { //Subclass (child)
	public void animalSound() {
		super.animalSound(); //Call the superclass method
		System.out.println("The dog says: bow wow");
	}
}
public class SuperKeyword {
 public static void main(String[] args) {
	 Animal1 myDog = new Dog(); //Create a Dog object
	 myDog.animalSound(); //call the method on the Dog object
 }
}

//Using super to call the superclass of Dog(subclass).
/*
 * The super keyword refers to superclass parent object.
 * It is used to call superclass methods, and to access the superclass constructor.
 * The most common use of the super keyword is to eliminate the confusion between superclasses and subclasse
 * that have methods with the same name.
 *  
 */
