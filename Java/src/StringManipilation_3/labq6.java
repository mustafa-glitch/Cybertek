package StringManipilation_3;

public class labq6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(withoutend("Hello"));
		
	}

	public static String withoutend(String str) {
		
		
		return str.substring(1,str.length()-1);
	}
}
