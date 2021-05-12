package Object_class;

import java.util.Scanner;

public class PositivenumberSum {

	public static void main(String[] args) {


		int num = 0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("enter a number");
			num=sc.nextInt();
			
			if(num<0) {
				break;
				
			}else {
				sum=sum+num;
				
			}
		}while(true);
     System.out.println("congrat");
	}

}
