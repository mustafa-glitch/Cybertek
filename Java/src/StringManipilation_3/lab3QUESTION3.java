package StringManipilation_3;

public class lab3QUESTION3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am java"));
		System.out.println(extraEnd("a"));
		

	}
	
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String dummy = "";
	
		dummy = str.substring(str.length()-2);
		
		return dummy+dummy+dummy;
		
	}

	
	
}
