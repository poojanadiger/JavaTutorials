package JavaFiles;
import java.io.File;
import java.io.IOException;

public class CreateFileInSpecificDirectory {
 public static void main(String[] args) {
	 try {
		 File myObj = new File("C:\\Users\\good\\Desktop\\filename.txt");
		 if(myObj.createNewFile()) {
			 System.out.println("File created: " +myObj.getName());
			 System.out.println("Absolute path: " + myObj.getAbsolutePath());
		 } else {
			 System.out.println("file already exists.");
		 }
	 } catch (IOException e) {
		 System.out.println("An error occurred. ");
		 e.printStackTrace();
	 }
 }
}

/*
 * To create a file in a specific directory(requires permission), specify the path of the file and use
 * double backslashes to escape the "\" character(for windows). On Mac and Linux you can
 * just write the path, like: /Users/name/filename.txt 
 */
