package JavaClassAttributes;

public class FinalAttribute {
  final int x = 10;
  
  public static void main(String[] args) {
	  FinalAttribute myobj = new FinalAttribute();
	  myobj.x = 25; //will generate an error
	  System.out.println(myobj.x);
  }
}
