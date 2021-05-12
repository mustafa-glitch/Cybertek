package String_part1;
public class task79_PrintingWovels {
public static void main(String[] args) {


		
		
		String str = "kkkkga";
		char myChar = 'k';
		
		int vounter=0;{
			
		
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==myChar) {
				
				vounter++;
			}
			
			
		}
		
		System.out.println("Count for " + myChar + " is " + vounter);
		
	
		}

		
		
		
}
}
