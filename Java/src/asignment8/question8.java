package asignment8;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isfibonacci();
	}


        
       public static void isfibonacci() {
		
    	  
    	        
    	        Scanner sc = new Scanner(System.in);
    	        
    	        System.out.print("Enter  Fibonacci Number:");
    	        int num = sc.nextInt();
    	        
    	        sc.close();
    	        
    	        System.out.println(" Fibonacci Number is: " + fibonacci(num));
    	    }
    	    
    	    public static int fibonacci(int num) {
    	        
    	        if(num <= 1) {
    	            return num;
    	        }
    	        
    	        return fibonacci(num-1) + fibonacci(num-2);
    	    } 
	
		
	
	}

