package TypeCasting;

public class NarrowCasting {
 public static void main(String[] args) {
	 double myDouble = 9.78;
	 int myInt = (int) myDouble; //Explicit casting: double to int
	 System.out.println(myDouble);
	 System.out.println(myInt);
	 System.out.println("Narrowing casting must be done manually by placing the type in parentheses in front of the value");
 }
}
