package EXERCISE_MYSELF;

public class inmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = {1,2,3,4,2,2,3,7};
		System.out.println(difference(x));
		
	
	}

	public static int difference(int [] arr) {
		
		//finding the biggest
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			max=arr[i];
			
			
			
		}
		//finding the smalles
		
				int min= max;
				
				for(int i=0; i<arr.length; i++){
					
					if(arr[i] < min) {
						
						min=arr[i];
						
					}
				
				
				
				}
				return max-min;
		
	}
}
