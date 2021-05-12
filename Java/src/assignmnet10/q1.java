package assignmnet10;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "javacc";
		
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter your message");
		String mesg = sc.next();
		
			
		if (mesg.indexOf("java")==0 || mesg.indexOf("java")==1) {
			System.out.println("True");
		}else {
			System.out.println(false);
		}
	
	}

}
