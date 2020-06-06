package JavaKeywords;

import java.util.Scanner; //import the scanner class

public class ImportKeyword {
 public static void main(String[] args) {
	 Scanner myObj = new Scanner(System.in);
	 String userName;
	 
	 //Enter username and press Enter
	 System.out.println("Enter username");
	 userName = myObj.nextLine();
	 
	 System.out.println("username is: "+userName);
 }
}

//The import keyword is used to import a package, class or interface.