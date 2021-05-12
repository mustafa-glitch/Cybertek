package StringManipilation_3;

public class lab3question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
	}
	
	public static String firstHalf(String str) {
		
		int x  = str.length()/2;
		
		return str.substring(0,x);
	}

}