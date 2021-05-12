package day30Wrapper;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
	}
   
	
	public static String welcome(String arr) {
		
		String str="";
		for(int i = 0; i<arr.length(); i++) {
			
			if(Character.isAlphabetic(arr.charAt(i)) || arr.charAt(i) == ' '){
				
					
				str = str + arr.charAt(i);
				
			}
		}
		 return str;
	}
}
