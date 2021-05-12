package EXERCISE_MYSELF;

public class StringUtility {

	public static void main(String[] args) {
		
		String name = "Java";
		//			   0123
		
		String reverse = "";  // "avaJ"
		
		reverse += name.charAt(name.length()-1);  //a
		reverse += name.charAt(2); //v
		reverse += name.charAt(1); //a
		reverse += name.charAt(0); //J
		
		System.out.println(reverse);
		
		System.out.println("--------------------------");
		
		String str = "Java Programming Language Is Awesome Language";
		String result = "";
		
		for(int i = str.length()-1;  i >= 0; i-- ) { // i: represents the index numbers starting from last index to 0
			result += str.charAt(i);
		}
		
		System.out.println(result);
		
		System.out.println("-------------------------------");
		
		
		
		

	}

	public static char[] isPalindrome(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
