package JavaDeleteFiles;
import java.io.File;
public class DeleteFolderEx {
 public static void main(String[] args) {
	 File myObj = new File("test");
	 if(myObj.delete()) {
		 System.out.println("Deleted the folder: "+ myObj.getName());
	 }else {
		 System.out.println("Failed to delete the folder");
	 }
 }
}

//You can also delete a folder. However, it must be empty!