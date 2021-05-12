package day28;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {2,4};
		int[] y= {4,2};
		int z[] = {3,4};
		
		System.out.println(prints(x));
		System.out.println(prints(y));
		System.out.println(prints(z));
	}

	public static boolean prints(int[] arr) {
		
		for(int value: arr) {
			
		
		if(value==2|| value==3) {
		 return true;	
		}
		}
			return false;
			
			
	}
}
