package EXERCISE_MYSELF;

public class printtheevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {2,3};
		
		System.out.println(sumofevens(x));
	}

public static int sumofevens(int[] arr) {
	
	int counter =0;
	for(int value: arr) {
		if (value%2==0) {
			
			counter++;
		}
		
		
	}
	
	
	return counter;
}
}