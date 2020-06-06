package JavaEnums;

public class Example2 {
 
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}
}

//You can also have enum inside a class