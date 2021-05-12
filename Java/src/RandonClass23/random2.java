package RandonClass23;

import java.util.Random;
import java.util.Scanner;

public class random2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int sum;
		int useranswer;
		
		Scanner sc = new Scanner(System.in);
		
		Random rn = new Random();
		
		num1 = rn.nextInt(100);
		num2 = rn.nextInt(100);
		
		System.out.println("what is the answer to the following problem");
		System.out.println(num1+"+"+num2+"= ?");
		
		useranswer =sc.nextInt();
		sum=num1+num2;
		
		if(useranswer==sum) {
			System.out.println("you got this");
			
			
		}else{
			System.out.println("sorry correct answer is"+sum);
		}
			
	}

}
