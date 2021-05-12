package String_part1;

public class replace {

	public static void main(String[] args) {
		
		String str = "Moscow is the capital of russia";
     
		str=str.replace("Moscow", "baku").replace("russia","azarbaijan");
		System.out.println(str);
		
		String str1 = "email is sent to the officer";
		
		str1=str1.replace("posta","neighbour");
		System.out.println(str1);
		
		/*********************/
		
		String sentence = "i love coding";
		String withnospace=sentence.replace("hate","coding");
		System.out.println(withnospace);
		
		
		
		String message = " i am your friend arent i?";
		String withnospace1 = message.replace(" ","");
		System.out.println(withnospace1);
		
		
		sentence = message.replace(",", "!!!");
		System.out.println(message);
	
	

		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		
		String mixed1 = "aasdsadf";
		mixed1=mixed1.replace("aasd", "");
		System.out.println(mixed1);
		
		String mixed2 = "mustafabuyukay";
		mixed2=mixed2.replace("musty","");
		System.out.println(mixed2);
		
		String mixed11 = "&^@#j$a-v|a@#$";
		mixed11 = mixed11.replace("&^@#", "");
		System.out.println(mixed11);
		mixed11 = mixed11.replace("@#$", "");
		System.out.println(mixed11);
		mixed11=mixed11.replace("$", "").replace("-", "").replace("|","");
		System.out.println(mixed11);
	}

}
