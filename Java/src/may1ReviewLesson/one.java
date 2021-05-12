package may1ReviewLesson;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expectedusername= "Cybertek";
		String expectedpasword="Cybertek123";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name");
		
		String username=sc.next();
	
		System.out.println("enter password");
		
		String passwordname=sc.next();
		
		if(username.equals(expectedusername) && passwordname.equals(expectedpasword)) {
			System.out.println("you logged in");
			
		}else {
			
			for(int i =1; i<=3; i++) {
				
			
			System.out.println("re enter the username");
			
			username=sc.next();
		
			System.out.println("re enter");
			
			passwordname=sc.next();
			
			
				if((username.equals(expectedusername) && passwordname.equals(expectedpasword))){
					
					System.out.println("logged in");
				break;
				
					
				}
				if (i==3) {
					System.err.println("blocked");
					System.exit(0);
				}
			}
			}
		}
		
	}


