package JavaDeleteFiles;
import java.io.File;
public class DeleteFileEx {
 public static void main(String[] args) {
	 File myObj = new File("filename.txt");
	 if(myObj.delete()) {
		 System.out.println("Deleted the file:" + myObj.getName());
	 } else {
		 System.out.println("Failed to delete the file");
	 }
  }
}

//To delete a file in java, use the delete() method