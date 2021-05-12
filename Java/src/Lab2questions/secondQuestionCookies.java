package Lab2questions;

import java.util.Scanner;

public class secondQuestionCookies {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 
	    System.out.print("Enter how many cookies you ate: ");
	 
	    int biscuit = sc.nextInt();
	 
	    int servingSize = 40/10;
	    int caloriesPerCookie = 300/servingSize;
	    int totalCalories = biscuit * caloriesPerCookie;
	 
	    System.out.println("Total calories consumed: " + totalCalories);
	
       }
}
