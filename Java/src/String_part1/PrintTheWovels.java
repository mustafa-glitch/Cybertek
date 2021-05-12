package String_part1;

public class PrintTheWovels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "cybertekschool";
	
		for(int i=0; i<word.length(); i++) {
			
			char letter=word.charAt(i);              ;
			if(letter=='a' || letter=='e' || letter=='o' || letter=='i' || letter=='u') {
			
           System.out.println(letter);

			
			if(i !=word.length()-2) {
				System.out.println(',');
				
			}
			}
		}
	}
}