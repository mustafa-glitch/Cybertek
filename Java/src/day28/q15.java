package day28;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {2,1,2,3,7};
		
		System.out.println((evennumber(x)));
	}

	public static int evennumber(int[] arr) {
		
		int counter=0;
		
		for(int value: arr) {
			
			if(value%2==0) {
				
				counter++;
				
			}
		}
		
		return counter;
	}
}
