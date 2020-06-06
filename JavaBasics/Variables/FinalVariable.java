package Variables;

public class FinalVariable {
 
	public static void main(String[] args) {
		int myNum = 15;
		//final int myNum = 15;
		myNum = 20; //will generate an error
		System.out.println(myNum);
	}

}
