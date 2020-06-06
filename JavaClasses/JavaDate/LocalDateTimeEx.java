package JavaDate;
/*
 * To display the current date and time, import the
 * java.time.LocalDateTime class, and use its
 * now() method
 */
import java.time.LocalDateTime; //import the LocalDateTime class

public class LocalDateTimeEx {
 public static void main(String[] args) {
	 LocalDateTime myObj = LocalDateTime.now();
	 System.out.println(myObj);
 }
}

//The T in the example above is used to separate the date from the time.