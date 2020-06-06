package JavaInnerClasses;

class OuterClass2{
	int x = 10;
	
	static class InnerClass2{
		int y = 5;
	}
}
public class StaticInnerClass {
  public static void main(String[] args) {
	  OuterClass2.InnerClass2 myInner = new OuterClass2.InnerClass2();
	  System.out.println(myInner.y);
  }
}
 //An inner class can also be static, which means that you can access it
//without creating an object of the outer class
//A static inner class does not have access to members of the outer class.