package Object_class;

import java.util.Scanner;
public class userinput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number");
		
		int num1=sc.nextInt();
		
		System.out.print("second number");
		
		int num2= sc.nextInt();
		System.out.print("third number");
		
		System.out.print("enter first name");
		String str1=sc.nextLine();
		

		System.out.print("enter a string");
		
		System.out.println("output:"+num1+num2+str1);
	}

}
