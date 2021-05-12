package assignmnet10;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print(" enter the ingredients : ");
		String str = sc.nextLine();
		
		if (str.contains("bread")) {
			str = str.substring(str.indexOf("bread")+5);
			int counter = 2;
			counter++;
		
		System.out.println(counter);
		}
	}

}
