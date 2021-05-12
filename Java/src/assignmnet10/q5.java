package assignmnet10;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the number for factorial calculation: ");
		
		int number=sc.nextInt();
		int result=1;
		
		for (int i=number; i>0;i--) {
			result=result*i;
			System.out.println(result);
	}

}
}
