package EXERCISE_MYSELF;

public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " java  ";  //|342|
		
				System.out.println(str.trim());
				
System.out.println("----------------------");

String sentence = "Java String Manipulation is fun!";

System.out.println(sentence.substring(2));
System.out.println(sentence.substring(5, 11));
System.out.println(sentence.length());
System.out.println(sentence.substring(5, sentence.length()-5));  //5,27


String chars = "{{}}";
String word = "AUTOMATION";

String result = chars.substring(0, 2) + word + chars.substring(2);
System.out.println(result);

System.out.println(word.toLowerCase());
	}

}
