package JavaInnerClasses;

class OuterClass{
	int x = 10;

class InnerClass{
	int y = 5;
}
}

public class MyMainClass {
 public static void main(String[] args) {
	 OuterClass myOuter = new OuterClass();
	 OuterClass.InnerClass myInner = myOuter.new InnerClass();
	 System.out.println(myInner.y + myOuter.x);
 }
}

//In java, it is also possible to nest classes(a class within a class) 
//The purpose of nested classes is to group classes that belong together which makes our code redable
//and maintainable.

//To access the inner class, create an object of the outer class and then create an object of inner class.
