package JavaInnerClasses;

class OuterClass1{
	int x = 10;

private class InnerClass1{
	int y = 5;
 }
}

public class PrivateInnerClass {
  public static void main(String[] args) {
	  OuterClass1 myOuter = new OuterClass1();
	  OuterClass1.InnerClass1 myInner = myOuter.new InnerClass1();
	  System.out.println(myInner.y + myOuter.x);
  }
}

//Unlike a regular class, an inner class can be private or protected. If you don't want outside
//objects to access the inner class, declare the class as private.