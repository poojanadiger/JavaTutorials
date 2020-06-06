package JavaDate;

import java.time.LocalDateTime; //Import the LocalDateTime class
import java.time.format.DateTimeFormatter; //Import the DateTimeFormatter class


 public class LocalDatetimeFormatterEx4 {
  public static void main(String[] args) {
	  LocalDateTime myDateObj = LocalDateTime.now();
	  System.out.println("Before Formatting: "+ myDateObj);
	  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
	  
	  String formattedDate = myDateObj.format(myFormatObj);
	  System.out.println("After Formatting: "+ formattedDate);
  }
}
