package EXERCISE_MYSELF;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {
	    
		System.out.println("Welcome to the Grader");

	    Scanner scan = new Scanner(System.in);

	    System.out.println("Please enter subject name number1 and score for this Subject");

	    String number1 =scan.nextLine();

	    int score=scan.nextInt();

	System.out.println("Please enter subject name number2 and score for this Subject");
	    
	    String number2 =scan.nextLine();

	    int score1=scan.nextInt();

	    System.out.println("Please enter subject name number3 and score2 for this Subject");


	String number3=scan.nextLine();

	    int score2=scan.nextInt();


	System.out.println("Please enter subject name number4 and score2 for this Subject");


	String number4=scan.nextLine();

	    int score3=scan.nextInt();

	    System.out.println("Please enter subject name number5 and score4 for this Subject");


	String number5=scan.nextLine();

	    int score4=scan.nextInt();

	   int Summary=score+score1+score2+score3+score4/5;

	   System.out.println("Your avarage score is:"+" "+Summary);
	   
	  }
	}