package asignment8;

import java.util.Scanner;

public class question1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	plus();
	}
	
	public static void plus() {
		
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int result=num1+num2+num3;
		System.out.println("result" +  result);
		
		
	}
}
