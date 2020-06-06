package JavaKeywords;

public class ContinueKeywordEx1 {
 public static void main(String[] args) {
	 for(int i = 0; i < 10; i++) {
		 if(i == 4) {
			 continue;
		 }
		 System.out.println(i);
	 }
 }
}

//Skip the iteration if the variable i is 4, but continue with the next iteration.
