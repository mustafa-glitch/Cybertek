package Arraylabs;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {2,3,4,5,6};
		int[] y = {6,3,4,5,6};
		int[] z = {2,3,4,5,6};
		
		System.out.println(lastnumber6(x));
		System.out.println(lastnumber6(y));
		System.out.println(lastnumber6(z));

	}
	
	
	
		public static boolean lastnumber6(int x[]) {
			
			

			if(x.length<1) {
				
			return false;
				
			}
			if(x[0]==6 || x.length-1 == 6) {
				
			return true;
			}else {
			return false;
		
	}
}
}