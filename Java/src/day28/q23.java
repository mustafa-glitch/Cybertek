package day28;

import java.util.Arrays;

public class q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(fizzArray(99)));
		}
		
		public static int[] fizzArray(int x) {
			
			int[] array = new int[x];
			
			for(int i=0;i<array.length;i++) {
				array[i]=i;
			}
			
			return array;
			
		
	}

}
