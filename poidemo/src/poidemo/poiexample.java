package poidemo;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiexample {
 public static void main(String[] args)throws Exception {
	 try {
	 XSSFWorkbook workbook = new XSSFWorkbook();
	 FileOutputStream out = new FileOutputStream(new File("Xceldemo.xlsx"));
	 XSSFSheet Spreadsheet = workbook.createSheet("Devnami");
	 workbook.write(out);
	 out.close();
	 
 }
 catch(Exception e) {
	 System.out.println(e);
 }
 System.out.println("Excel fil created");
 }
}