package day28;

import java.util.Arrays;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {2,3,3};
		int[]y ={3,2,3};
		
		System.out.println(Arrays.toString(changedarray(x)));
		System.out.println(Arrays.toString(changedarray(y)));
	}

	public static int[] changedarray(int[] arr) {
		
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				
				arr[i+1]=0;
			}
		}
	
	   return arr;
	}
}
