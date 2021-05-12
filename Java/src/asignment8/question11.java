package asignment8;

import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter buy price");
		int x = sc.nextInt();
		
		System.out.println("enter sell price");
		int max = sc.nextInt();
		
		
		int buyprice = 10;
		int sellprice = 50;
		if(sellprice>buyprice) {
			System.out.println("profit");
			
		}
		if(sellprice>buyprice) {
			System.out.println("profit");
		
		
		
		}
		
		
		if(sellprice==buyprice) {
			System.out.println("no loss");
		}
	}

	
}
