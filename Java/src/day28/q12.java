package day28;

import java.util.Arrays;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]x= {1,2,3};
		int[]y= {1,1,1};
		
		System.out.println((one(x,y)));
	}
	
	public static int one(int[] arr1, int[] arr2) {
	
		
	int counter=0;
	
	
	if(arr1[0]==1) {
		counter++;
	}	
	if(arr2[0]==1) {
		counter++;
	}
	
	return counter;
	
	}
}
