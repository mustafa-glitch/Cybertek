package day33_Class_Objects_Constructors;

import java.util.Scanner;

public class Bank_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input;
		
		System.out.println("what is your balance");
		
		
		input=scan.next();
		
		Bank account = new  Bank();
		
		System.out.println("how much were you paid this month");
		
		
		input=scan.next();
		
		account.deposit(input);
		

	}

}
