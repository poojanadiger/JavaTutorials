package JavaClassesObjects;

public class MultipleObjects {
 int x = 5;
 public static void main(String[] args) {
	 MultipleObjects myObj1 = new MultipleObjects();
	 MultipleObjects myObj2 = new MultipleObjects();
	 System.out.println(myObj1.x);
	 System.out.println(myObj2.x);
	 System.out.println("You can create multiple objects of one class");
 }
} 
