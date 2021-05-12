package EXERCISE_MYSELF;

public class finddifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = {1,2,3,4,3,9};
		
		System.out.println(difference(x));
	}

	public static int difference(int[] arr) {
		
		//finding the biggest
		
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max=arr[0];
				
			}
		}
		//finding the smalles
		
		int min = max;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
				
			}
			
			
			
			
			
		}
		return max-min;
}
}
