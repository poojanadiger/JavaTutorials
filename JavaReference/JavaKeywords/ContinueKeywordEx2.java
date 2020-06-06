package JavaKeywords;

public class ContinueKeywordEx2 {
 public static void main(String[] args) {
	 int i = 0;
	 while(i < 10) {
		 if(i==4) {
			 i++;
			 continue;
		 }
		 System.out.println(i);
		 i++;
	 }
 }
}

//The continue keyword is used to end the current iteration in a for loop(or a while loop,
//and continue to the next iteration.