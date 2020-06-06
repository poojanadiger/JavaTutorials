package JavaModifiers;

class AccessModifiersEx {
 protected String fname1 = "John";
 protected String lname1 = "Doe";
 protected String email1 = "john@doe.com";
 protected int age1 = 24;
 
}

class AccessModifiersEx5 extends AccessModifiersEx{
	
	private int graduationYear = 2018;

	public static void main(String[] args) {
		
		AccessModifiersEx5  myObj = new AccessModifiersEx5();
		System.out.println("Name: " + myObj.fname1 + " " + myObj.lname1);
		System.out.println("Email: "+ myObj.email1);
		System.out.println("Age: "+ myObj.age1);
		System.out.println("Graduation Year: " + myObj.graduationYear);
		System.out.println("The code is accessible in the same package and subclasses");
		
		
	}
	
}
