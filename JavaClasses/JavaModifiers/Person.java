package JavaModifiers;

abstract class Person {
  public String fname = "John";
  public String lname = "DOe";
  public String email = "john@doe.com";
  public int age = 24;
  
  public abstract void study();
}  
  //subclass
  class Student extends Person{
	  public int graduationYear = 2018;
	  public void study() {
		  System.out.println("Studying all day long");
	  }
  }
 
