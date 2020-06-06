package JavaKeywords;

interface Animal{
	public void animalSound(); //interface method does not have a body.
	public void sleep(); //interface method does not have a body.
}

class Pig implements Animal{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		System.out.println("zzz");
		}
}
public class InterfaceKeywordEx1 {
 public static void main(String[] args) {
	 Pig myPig = new Pig();
	 myPig.animalSound();
	 myPig.sleep();
 }
}

/*
 * An interfae is an abstract class that is used to group related methods with empty bodies.
 * To access the interface methods, the interface must be 'implemented' by another class with the
 * implements keyword. The body of the interface method is provided by the implement class.
 * 
 *  The implements keyword is used to implement an interface.
 *  
 *  The interface keyword is used to declare a special type of class that only contains abstract methods.
 *  
 *  To access the interface methods, the interface must be implemented by another class with the 
 *  implement keyword.
 *  The body of the interface is provided by the implement class.
 */
