package JavaInnerClasses;

class OuterClass3{
	int x = 10;
	
	class InnerClass3{
		public int myInnerMethod() {
			return x;
		}
	}
}
public class Example1 {
 public static void main(String args[]) {
	 OuterClass3 myOuter = new OuterClass3();
	 OuterClass3.InnerClass3 myInner = myOuter.new InnerClass3();
	 System.out.println(myInner.myInnerMethod());
 }
}

//Access outer class from inner calss
//One advantage of inner classes, is that they can access attributes and methods of the outer class