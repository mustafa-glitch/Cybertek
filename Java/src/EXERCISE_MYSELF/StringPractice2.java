package EXERCISE_MYSELF;

public class StringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "java";
		String s2 = "java";
		String s3 = "java";
		
		String s4 = new  String("java");
		
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
