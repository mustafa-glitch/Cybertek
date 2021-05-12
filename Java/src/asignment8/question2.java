package asignment8;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cube();
	}

	public static void cube() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int input = sc.nextInt();
		
		
		int cubedvalue= input*input*input;
		
		System.out.println(cubedvalue);
	}
}
