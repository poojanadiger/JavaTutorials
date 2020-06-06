package JavaKeywords;

public class PrivateKeywordEx {
 private String fname = "John";
 private String lname = "Doe";
 private String email = "john@doe.com";
 private int age = 24;
 
 
 public static void main(String[] args) {
	 PrivateKeywordEx myObj = new PrivateKeywordEx();
	 System.out.println("name: " + myObj.fname + " " + myObj.lname);
	 System.out.println("email: "+ myObj.email);
	 System.out.println("Age: "+ myObj.age);
 }
}

//The private keyword is an access modifier used for attributes, methods and constructors, making
//them only accessible within the declared class.