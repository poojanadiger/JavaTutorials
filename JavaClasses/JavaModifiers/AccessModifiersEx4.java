package JavaModifiers;

public class AccessModifiersEx4 {
 private String fname = "John";
 private String lname = "Doe";
 private String email = "john@doe.com";
 private int age = 24;
 
 public static void main(String[] args) {
	 AccessModifiersEx4 myObj = new AccessModifiersEx4();
	 System.out.println("Name:" + myObj.fname + " " + myObj.lname);
	 System.out.println("Email: " + myObj.email);
	 System.out.println("Age: "+ myObj.age);
	 System.out.println("The class attributes is only accessible within the declared class");
 }
}
