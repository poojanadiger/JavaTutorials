package JavaKeywords;

public class SwitchKeywordEx {
 public static void main(String[] args) {
	 int day = 4;
	 switch(day) {
	 case 1:
		 System.out.println("Monday");
		 break;
	 case 2:
		 System.out.println("Tuesday");
		 break;
	 case 3:
		 System.out.println("Wednesday");
		 break;
	 case 4:
		 System.out.println("Thursday");
		 break;
	 case 5:
		 System.out.println("Friday");
		 break;
	 case 6:
		 System.out.println("Saturday");
		 break;
	 case 7:
		 System.out.println("Sunday");
		 break;
	 }
  }
}

//Use the Switch statement to calculate the weekday name.
/*
 * The switch keyword selects one of many code blocks to be executed.
 * From the example above, it works like this:
 * The switch expression is evaluated once.
 * The value of the expression is compared with the values of each case.
 * If there is a match, the associated block of code is executed.
 * The break keyword is used to break out of the switch block when a match is found.
 */
