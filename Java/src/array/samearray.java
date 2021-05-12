package array;

public class samearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array1 = { 1,2,3,4,5};
		int [] array2 = array1;
		
		array1 [0] = 200;
		array2[4]=20;
		
		System.out.println("the concents of array 1");
		
		for(int value: array1) {
			System.out.println(value);
		}
		
		
		System.out.println("the concects of array2");
		
		for(int value: array2) {
			
			System.out.println(value);
		}
	}

}
