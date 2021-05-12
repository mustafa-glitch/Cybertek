package day28;

import java.util.Arrays;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = {1,7};
	
	    System.out.println(Arrays.toString(makelist(x)));
	
	}
	
     public static int[] makelist(int[] arr) {
    	 
    	 int[] newarray = new int[2*arr.length];
    	 
    	 newarray[newarray.length-1]=arr[arr.length-1];
    	 
    	 return newarray;
     }
}
