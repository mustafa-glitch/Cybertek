package day30Wrapper;

public class varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(2,2,2,2,2,2,2,2,2,2,2);
		sum(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
	
		concat("helo mutherfucker");
		concat("hola mutherfucker");
		concat("privet mutherfucker");
	
	
	}

	public static void sum(int...numbers) {
		int sum=0;
		for(int value: numbers) {
			
			sum=sum+value;
			
			
		}
		
		System.out.println(sum);
		
		
		
	}
	
	public static void concat(String...strs) {
		
		
		String newstr = "";
		
		for(String str : strs) {
			
			newstr=newstr+str.charAt(0);
			
		}
		
		System.out.println(newstr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
