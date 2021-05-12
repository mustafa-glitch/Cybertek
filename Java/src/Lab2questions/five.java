package Lab2questions;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("enter charge of the meal: ");
        int charge = sc.nextInt();

        double tax = charge * 6.75 / 100;

        double tip = (charge+tax)/5;

        double total = charge+tip;

        total = Math.round(total*100);
        total = total/100;

        System.out.println(    "your charge: " + charge + "\nyour tax: " + tax + "\nyour tip: " + tip 
                            + "\nyour total fee is: " + total);
	}

}
