package JavaKeywords;

abstract class AbstractClass {
 public String fname = "john";
 public int age = 24;
 public abstract void study(); //abstract method
}

//Subclass inherit from AbstractClass
 class Student extends AbstractClass{
	 public int graduationYear = 2018;
	 public void study() {
		 //the body of the abstract method is provided here
		 System.out.println("Studying all day long");
	 }
 }

 //The abstract keyword is a non access modifier, used for classes and methods.
 
 //class: An abstract class is a restricted class that cannot be used to create objects.
 //To access it, it must be inherited from another class.
 
 //Method: An abstract method can only be used in an abstract class, and it does not have a body,
 //the body is provided by the subclass.