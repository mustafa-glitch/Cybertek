package array;

import java.util.Arrays;

public class task94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		
		String[] infoArray1 = info1.split("password :");
		String[] infoArray2 = info2.split("password :");
		
		System.out.println(Arrays.toString(infoArray1));
		
		
		String pass1 = infoArray1[1].split(". Please")[0];
		
		System.out.println(Arrays.toString(infoArray1[1].split(". Please")));
		
	}

}
