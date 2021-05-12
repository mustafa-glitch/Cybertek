package EXERCISE_MYSELF;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name = "java";

	
		String reverse = "";
		
		reverse+=name.charAt(3);
		reverse+=name.charAt(2);
		reverse+=name.charAt(1);
		reverse+=name.charAt(0);
		System.out.println(reverse);
		
		System.out.println("--------------------");
		String name1 = "java is a fun languager";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			char result = name1.charAt(i);
			
		}
		

	}

}
