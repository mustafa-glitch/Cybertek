package EXERCISE_MYSELF;

public class UniqueCharachter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdef";
		String result = "";
		
		
		char ch1  = str.charAt(0);
		int count =0;
	    for(int i = 0; i<str.length(); i++) {
	    	if(str.charAt(i)==ch1);
	     count++;	
	     
	     System.out.println(count);
	    }

}
}