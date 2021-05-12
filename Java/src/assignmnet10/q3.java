package assignmnet10;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "";
		String sep ="";
		int counter;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the word: ");
		String word1=sc.nextLine();
		
		System.out.println("enter the seperaator: ");
		String seperator=sc.nextLine();
		

		int count = 3;
		for(int i=0; i<count;i++) {
			System.out.print(word1);
			if(i<(count-1)) {
				System.out.print(seperator);
	}

}

	}
}