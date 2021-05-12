package String_part1;

public class IndexOf {

	public static void main(String[] args) {
		
		
		String word1 = "github";
		
		System.out.println(word1.indexOf(4));
		System.out.println(word1.indexOf("hub"));
		
		String url = "www.okta.com";
	     
		int i = url.indexOf(".");
		System.out.println("pos of ."+ i);
		System.out.println(url.charAt(i+1));
		
		
		String country ="united states of america";
	
     System.out.println(country.indexOf("states"));	;
     
     String word2 = "java, c++, python, tomcat, eclipse";
     System.out.println(word2.indexOf("c++"));
     int java =word2.indexOf("java");
     
     if(word2.contains("java")) {
    	 System.out.println(true);
     }
	//indexOf
     if(word2.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
	}

}
