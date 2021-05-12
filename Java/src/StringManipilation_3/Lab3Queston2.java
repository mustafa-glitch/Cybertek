package StringManipilation_3;

public class Lab3Queston2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(makeabba("hi","alice"));
		System.out.println(makeabba("hi","bob"));
	}

	
	 public static String makeabba(String str1,String str2) {
		
		return str1+str2+str2+str1;
	}
}
