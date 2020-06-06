package JavaInterface;

interface Animal{
	public void animalSound(); //interface method(does not have a body)
	public void sleep(); //interface method (does not have a body)
}

class Pig implements Animal{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		System.out.println("zzz");
	}
}

public class Example1 {
 public static void main(String[] args) {
	Pig myPig = new Pig();
	myPig.animalSound();
	myPig.sleep();
 }
}

//An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//To access the interface methods, the interface must be "implemented" by another class with the implements keyword
//(instead of extends). The body of the interface method is provided by the "implement" class:

//Like abstract classes, interfaces cannot be used to create objects.
//Interface methods do not have a body - the body is provided by the "implement" class
