package day28;

import java.util.Arrays;

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10};
		
		System.out.println(Arrays.toString(rotateleft(a)));
	}

	   public static int[] rotateleft(int[] arr) {
		
		int x=arr[0];
		for(int i=0; i<arr.length-1; i++) {
			
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=x;
		
		return arr;
	
	}
}
