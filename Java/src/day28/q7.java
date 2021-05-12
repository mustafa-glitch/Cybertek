package day28;

import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]= {1,2,3,4,5,5,3,1};
		int y[]= {};
		
		System.out.println(Arrays.toString(makeends(x,y)));
	}

	public static int[] makeends(int[] arr1, int[] arr2) {
		
		arr2 = new int[2];
		arr2[0]=arr1[0];
		
		arr2[1]=arr1[arr1.length-1];
		
		return arr2;
		
		
	}
}
