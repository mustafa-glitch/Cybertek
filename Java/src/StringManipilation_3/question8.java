package StringManipilation_3;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println(rotatedleft("hello"));
	}

	
	public static String rotatedleft(String str1) {
		
		
		return str1.substring(2, 5).concat(str1.substring(0,2));
	}
}
