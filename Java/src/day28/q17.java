package day28;

public class q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {1,2,3,4,5,6,7,8,9};
		
		System.out.println((difference(x)));
	}

	public static int difference(int[] arr) {
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			
			
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
			
		}
	
		
		
		int min=max;
		
		
            for(int i=0; i<arr.length; i++) {
			
		
			
			if(arr[i]<min) {
				min=arr[i];
			}
		
		}

 
            return max-min;
	}
}
