package day28;

import java.util.Arrays;

public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {2,9};
		int[] y= {3,1};
		
		int[]k=new int[x.length+y.length];
		
		System.out.println(k.length);
		
		for(int i=0; i<x.length; i++) {
			k[i]=x[i];
		}
		int n=0;
		for(int j=x.length; j<k.length; j++) {
			
			k[j]=y[n];
			n++;
		}
		System.out.println(Arrays.toString(k));
	}
}
