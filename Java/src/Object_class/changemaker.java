package Object_class;

import java.util.Scanner;

public class changemaker {

	public static void main(String[] args) {
		// enter a whole number from 1-100 and i will find the combination of coins that equals that amount of the change

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter a number 1-99");
		int amount =keyboard.nextInt();
		int quarters=amount/25;
		amount=amount%25;
		int dimes=amount/10;
		amount=amount%10;
		int nickles=amount/5;
		amount=amount%5;
		int pennies=amount/1;
		amount=amount%1;
		
		System.out.println(amount+"cents in coin can be given as :");
		System.out.println(quarters+"quarters");
		System.out.println(dimes+"dimes");
		System.out.println(nickles+"nickles");
		System.out.println(pennies+"pennies");
		
		
	}

}
