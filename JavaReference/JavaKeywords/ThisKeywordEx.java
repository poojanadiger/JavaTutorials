package JavaKeywords;

public class ThisKeywordEx {
 int x;
 
 //constructor with a parameter
 public ThisKeywordEx(int x) {
	 this.x = x;
 }
 
 //call the constructor
 public static void main(String[] args) {
	 ThisKeywordEx myObj = new ThisKeywordEx(5);
	 System.out.println("Value of x = " + myObj.x);
 }
}

/*
 * The this keyword refers to the current object in a method or constructor.
 * The most common use of the this keyword is to eliminate the confusion
 * between class attributes and parameters with the same name
 * because a class attribute is shadowed by a method or constructor parameter.
 * this can also be used to:
 * Invoke current class constructor.
 * Invoke current class method.
 * Return the current class object.
 * Pass an argument in the method call.
 * pass an argument in the constructor call.
 */
