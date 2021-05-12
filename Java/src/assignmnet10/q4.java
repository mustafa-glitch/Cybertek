package assignmnet10;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String str =  sc.next();
	     	
	
			
		

		int counter = 0;
		while (str.contains("java")) {
			str = str.substring(str.indexOf("java")+4);
			counter++;	
		}
		System.out.println(counter);
	
	}

}
