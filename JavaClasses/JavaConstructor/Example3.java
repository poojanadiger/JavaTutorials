package JavaConstructor;

public class Example3 {
 int modelYear;
 String modelName;
 
 public Example3(int year, String name) {
	 modelYear = year;
	 modelName = name;
 }
 
 public static void main(String[] args) {
	 Example3 myCar = new Example3(1969,"Mustang");
	 System.out.println(myCar.modelYear+" "+ myCar.modelName);
 }
}
