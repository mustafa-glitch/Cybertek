package EXERCISE_MYSELF;

public class StringPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Java";//literal
		String str2 = "Java";//literal
	
	   String str3 = "Java";//literal
	   //in string pool there is only one object shared//
      System.out.println(str1==str2);//true
      
      
      String s1 = new String("Java");
      String s2 = new String("Java");
      String s3 = new String("Java");
      
      System.out.println(s1==s2);
      System.out.println(s2==s3);
      System.out.println(s3==s1);
}  
}