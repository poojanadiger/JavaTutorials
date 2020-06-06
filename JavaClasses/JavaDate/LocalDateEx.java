package JavaDate;
//To display the current date, import the java.time.LocalDate class, and use its now() method

import java.time.LocalDate; //import the localDate class
public class LocalDateEx {
	
	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now(); //Create a date object
		System.out.println(myObj);//Display the current date
	}
 
}

/*
 * Java does not have a built in date class, but we can import the java.time package to work with 
 * the date and time API. The package includes many date and time classes. For example:
 * 
 * LocalDate Represents a date(year, month, day)
 * LocalTime Represents a time(hour, min, sec, millisec)
 * LocalDateTime Represents both a date and a time
 * DateTimeFormatter Formatter for displaying and parsing date-time objects
 */
