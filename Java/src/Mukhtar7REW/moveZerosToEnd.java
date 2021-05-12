package Mukhtar7REW;

import java.util.Arrays;

public class moveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1,2,3,0,0,4,0,5};
		
		int [] newarray = new int [array.length];
		int i=0;
		System.out.println(Arrays.toString(array));
		
		
		for(int each: array) {
			
			if(each!=0) {
				newarray[i++]=each;
				
			
		}
		System.out.println(Arrays.toString(newarray));
	}

}
}