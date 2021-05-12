package may1ReviewLesson;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "listen";
		String str1="silent";
		
		System.out.println();
		
		char[] ch1 = str.toCharArray();
		char[] ch2 = str.toCharArray();
		
		
		System.out.println((Arrays.toString(ch1)));
		System.out.println((Arrays.toString(ch2)));
	
	   boolean isarray =(Arrays.equals(ch1, ch2));
	
	}

}
