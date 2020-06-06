package JavaClassAttributes;

public class MultipleObjects {
 int x = 5;
 
 public static void main(String[] args) {
	 MultipleObjects myObj1 = new MultipleObjects();
	 MultipleObjects myObj2 = new MultipleObjects();
	 myObj2.x = 25;
	 System.out.println(myObj1.x);
	 System.out.println(myObj2.x);
	 System.out.println("If you create multiple objects of one class, you can change the attribute values");
	 System.out.println("in one object, without affecting the attribute values in the other");
 }
}
