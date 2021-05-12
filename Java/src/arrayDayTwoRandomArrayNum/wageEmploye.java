package arrayDayTwoRandomArrayNum;

import java.util.Scanner;

public class wageEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		final int employees = 5;
		double payrate;
		double grosspay;
		
		
		Scanner sc =new Scanner(System.in);
		
		int hours[] = new int [employees];
		
		
		System.out.println("enter the hours worked by " + employees);
		
		for(int i=0; i<employees; i++) {
			
			hours[i]=sc.nextInt();
			
		}
		
		
		
	
		 System.out.println("hoursly rate for each employee");
		 
		 payrate=sc.nextDouble();
		 
		 
		 for(int i=0; i<employees; i++) {
			 
			 grosspay=hours[i]*payrate;
			 
			 System.out.println("employee"+ (i+1)+ "$"+grosspay);
		 }
		 
		 
		 
		 
		 
		 
		 
	}

}
