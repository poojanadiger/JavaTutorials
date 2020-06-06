package JavaFiles;

import java.io.File;
import java.io.IOException;

public class CreateaFile {
 public static void main(String[] args) {
	 try {
		 File myObj = new File("filename.txt");
		 if(myObj.createNewFile()) {
			 System.out.println("File created: " + myObj.getName());
		 }
		 else {
			 System.out.println("File already exists");
		 }
	 }
	 catch (IOException e) {
		 System.out.println("An error occurred.");
		 e.printStackTrace();
	 }
 }
}

/*
 * To create a file in java, you can use the createNewFile() method. This method returns a boolean
 * value: true if the file was successfully created, and false if the file already exists.
 * Note: that the method is enclosed in a try catch block.
 * This in necessary because it throws an IOException if an error occurs
 * if the file cannot be created for some reason). 
 */
