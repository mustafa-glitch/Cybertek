package array;

import java.util.Scanner;

public class methodarraypass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create n array
		int[] numbers = new int[4];
		
		//pass the arrays to get valueg
		
		getvalues(numbers);
		
		System.out.println("here are the numbers you passed");
		
		//pass the array to show array method
		showarray(numbers);
		
	}

	

	private static void getvalues(int[] array) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter series of"+array.length+ " numbers");
		
		
		
		
		
		for(int i =0; i<array.length; i++) {
			
			System.out.println("enter number"+(i+1)+"");
			
			
			array[i]=sc.nextInt();
		}
		}
		
		private static void showarray(int[] array) {
			for(int value: array) {
				
				System.out.println(value);
			}

		}
}

