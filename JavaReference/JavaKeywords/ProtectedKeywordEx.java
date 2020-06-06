package JavaKeywords;

class Person {
 protected String fname = "Jolkjhlkhn";
 protected String lname = "Doe";
 protected String email = "john@doe.com";
 protected int age = 24;
}

class ProtectedKeywordEx extends Person{
	private int graduationYear = 2018;
	
	public static void main(String[] args) {
		ProtectedKeywordEx myObj = new ProtectedKeywordEx();
		System.out.println("Name: "+ myObj.fname + " "+ myObj.lname);
		System.out.println("Email: "+ myObj.email);
		System.out.println("Age: "+ myObj.age);
		System.out.println("Graduation Year: " +myObj.graduationYear);
	}
}

//The protected keyword is an access modifier used for attribute,
//methods and constructors, making them accessible in the same package and
//subclasses.