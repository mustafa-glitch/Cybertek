package asignment8;

import java.util.Scanner;

public class question9th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		max();
	}

	public static void max() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter x");
		int x = sc.nextInt();
		

		int max = sc.nextInt();
		
		
		if(x<max) {
			System.out.println(max);
			
		}else {

			System.out.println(x);
		}
	}
}
