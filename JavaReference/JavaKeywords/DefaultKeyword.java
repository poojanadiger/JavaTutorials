package JavaKeywords;

public class DefaultKeyword {
 public static void main(String[] args) {
	 int day = 4;
	 switch(day) {
	 case 6:
		 System.out.println("Today is Saturday");
		 break;
	 case 7:
		 System.out.println("Today is Sunday");
		 break;
		 default:
			 System.out.println("Looking forward to the weekend");
	 }
  }
}

//Specify some code to run if there is no case match in a switch block.

//The default keyword specifies some code to run if there is no case match in the switch.

//Note: if the default keyword is used as the last statement in a switch block, it does not need

//a break.