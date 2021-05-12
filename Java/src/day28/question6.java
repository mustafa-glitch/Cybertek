package day28;

import java.util.Arrays;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,229};
		
		System.out.println(Arrays.toString(maxend(x)));
	}

	public static int[] maxend(int[] arr) {
		
		int max = 0;
		
		for(int i=0; i<arr.length-1; i++) {
		
			if(arr[i+1]>max) {
	
			max = arr[i+1];
			
			}	
			}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=max;
		}
		return arr;
		}
}


