package Object_class;

import java.util.Scanner;

public class ShowSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number 3 times");
		
		
      
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
		 
        int sum = num1+num2+num3/3;
        
        System.out.println(sum);
	}

}
