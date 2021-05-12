package asignment8;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nextree(1);
		
	}

	public static void nextree(int num1) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x= sc.nextInt();
		
		
		System.out.println("next tree are:" + (x+1)+""+""+(x+2));
	}
}
