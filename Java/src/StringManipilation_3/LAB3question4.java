package StringManipilation_3;

public class LAB3question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firsttwo("hello"));
	
		
	}
  
	public static String firsttwo(String str1) {
		
		if(str1.length()<2) {
			
			return str1;
		}else if(str1.isEmpty()) {
			
			return "";
			
			
		}else {
			return str1.substring(0,2);
		}
		
		
	}
}
