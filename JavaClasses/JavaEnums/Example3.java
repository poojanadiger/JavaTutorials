package JavaEnums;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}
public class Example3 {
  public static void main(String[] args) {
	  Level myVar = Level.MEDIUM;
	  
	  switch(myVar) {
	  case LOW:
		  System.out.println("Low level");
		  break;
	  case MEDIUM:
		  System.out.println("Medium level");
	      break;
	  case HIGH:
		  System.out.println("High leve");
		  break;
	  }
  }
}

//Enums are often used in switch statements to check for corresponding values.