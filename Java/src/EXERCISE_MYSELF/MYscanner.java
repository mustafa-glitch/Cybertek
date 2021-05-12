package EXERCISE_MYSELF;

import java.io.InputStream;
import java.util.Scanner;

public class MYscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner eligibility = new Scanner(System.in);
		
		System.out.println("what is your current salary");
		
		int salary = eligibility.nextInt();
		
		System.out.println("what is your expected salary");
		
		int expectedsalary = eligibility.nextInt();
		
		System.out.println("what is your age");
		
		
		int age = eligibility.nextInt();
		
		if(age<20) {
			System.out.println("not eligible for the job");
			
			
		} else if (expectedsalary>3000) {
			System.out.println("we can agree only when the salary is lower than 3000");
		}
	}
}
