package Arraylabs;

import java.util.Arrays;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//tostring
		int sc[] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(sc));
	   
		
		//equals
		int sct[] = {1,2,3,4,5,3};
		int scr[] = {1,2,3,4,5,6};
	
		System.out.println(Arrays.equals(sct, scr));
	
	
		int sct1[] = {1,2,11,22,33,1};
		int scr1[] = {1,2,3,4,5,6};
	     
		Arrays.sort(sct1);
		System.out.println(Arrays.toString(sct1));
		
		String str[] = {"mola","hola","1ola"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		System.out.println("-----------------");
		//binarysearch
		int www[] = {1,2,11,22,33,1};
		
		System.out.println(Arrays.binarySearch(www, 3));
		
		System.out.println("-----------------");
		
		int qq[] = {1,2,11,22,33,1};
		int d1[]=qq;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(qq));
	}

}
