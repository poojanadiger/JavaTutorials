package JavaDate;
import java.time.LocalDateTime; //Import the LocalDateTimeClass
import java.time.format.DateTimeFormatter; //Import the DateTimeFormatter class

public class LocalDateTimeFormatterEx5 {
 public static void main(String[] args) {
	 LocalDateTime myDateObj = LocalDateTime.now();
	 System.out.println("Before Formatting: "+ myDateObj);
	 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
	 
	 String formattedDate = myDateObj.format(myFormatObj);
	 System.out.println("After Formatting: "+ formattedDate);
 }
}
