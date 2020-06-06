package JavaDate;
/*
 * You can use the DateTimeFormatter class with the ofPatter() 
 * method in the same package to format or parse date-time objects.
 */

import java.time.LocalDateTime; //Import the LocalDateTime Class
import java.time.format.DateTimeFormatter; //Import the DateTimeFormatter class

public class LocalDateTimeFormatterEx1 {
	
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: "+ formattedDate);
	}

}
