package Lab2questions;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("enter charge: ");
        int charge = sc.nextInt();

        double stTax = charge/25.0;
        double coTax = charge/50.0;
        double totalTax = stTax+coTax;
        double totalCharge = charge + totalTax;

        System.out.println("your charge: " + charge + "\nstate tax: " + stTax + "\ncountry tax: " +
                            coTax + "\ntotal tax: " + totalTax + 
                            "\nyour total charge is: " + totalCharge);
	}

}
