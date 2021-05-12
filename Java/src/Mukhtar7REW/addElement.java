package Mukhtar7REW;

import java.util.Arrays;

public class addElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {1,2,3};
		int add = 4;
		
		int [] newarray = new int [arr.length+1];
		
		int i=0;
		for(int each: arr) {
			
			newarray[i++]=each;
			
		}
		
		newarray[i]= add;
		
		System.out.println(Arrays.toString(newarray));
		
		
	}
	
	public static int[] addelement(int[] arr, int add) {
		
        int [] newarray = new int [arr.length+1];
		
		int i=0;
		for(int each: arr) {
			
			newarray[i++]=each;
			
		}
		
		newarray[i]= add;
		
		return newarray;
	}

}
