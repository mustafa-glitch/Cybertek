package day28;

import java.util.Arrays;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x={9,2};
		int[]y= {9,4};
		
		bigger(x,y);
	}

	public static void bigger(int[] array1, int[] array2) {
	
		
		int sum1=0;
		int sum2=0;
		
		for(int value: array1) {
			
			sum1=sum1+value;
		}
	for(int value: array2) {
			
			sum2=sum1+value;
	}
	
	if(sum1>sum2) {
		
		System.out.println(Arrays.toString(array1));
	}else if (sum2>1) {
		
	
	System.out.println(Arrays.toString(array2));
	
	}
	
	
	}
}
