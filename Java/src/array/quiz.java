package array;

import java.util.Arrays;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
	
		
		
           String[] myarray = {"orange","apple", "watermelon","lemon"};
           
           int [] mylist = {10,20,30,40};
           
           System.out.println(mylist[0]);
           System.out.println(mylist[1]);
           System.out.println(mylist[2]);
           System.out.println(mylist[3]);
	       
           System.out.println(mylist.length);
	       System.out.println(myarray.length);
	
	
	System.out.println("---------------------------");
	     
	
	for(int i =0; i<mylist.length; i++) {
	    	   System.out.println(mylist[i]);
	    	   
	    	   System.out.println("---------------------------");
	    	   
	    	   
	    	   int[] scores = {10,20,30,40,50,60,70,80,90};
	    	   
	    	   int sum=0;
	    	   for(int i1 =0; i<scores.length; i++) {
	    		   
	    		  
	    		   
	    		   sum=sum+scores[i];
	    		   
	    		  
	    	   }
	    	   
	    	   System.out.println("sum is"+sum);
	
	           System.out.println("total element of array"+scores.length);
	           
	           System.out.println("avarage of scores is"+sum/scores.length);
	
	           System.out.println("----------------------------------------");
	
	}
	
	int [] nums = new int [5];
	
	  nums[0]=10;
	  nums[1]=20;
	  nums[2]=30;
	  nums[3]=40;
	  nums[4]=60;
	
	  System.out.println(nums[0]);
	  System.out.println(nums[1]);
	  System.out.println(nums[2]);
	  System.out.println(nums[3]);
	  System.out.println(nums[4]);
	  
	  int avaragescore=   (nums[0]+nums[1]+nums[2]+nums[3]+nums[4])/5;
	  
	  System.out.println("av is"+avaragescore);
	  
	  System.out.println("--------------------------------------------");
	  
	  String[] myArray = new String[12];
		
	    Scanner sc = new Scanner(System.in);
		myArray[0]="Jan";
		myArray[1]="Feb";
		myArray[2]="March";
		myArray[3]="April";
		myArray[4]="May";
		myArray[5]="June";
		myArray[6]="July";
		myArray[7]="August";
		myArray[8]="Sept";
		myArray[9]="October";
		myArray[10]="Nov";
		myArray[11]="Dec";
		
		System.out.print("Enter your month index number:");
		int index = sc.nextInt();
		
		System.out.println("The month is " + myArray[index]);
		
		System.out.println(myArray);

		System.out.println("-------------------------------");

	     
		String[] sc1 = new String[7];
		
		
		Scanner day = new  Scanner(System.in);
	
		sc1[0]="monday";
		sc1[1]="tuesday";
		sc1[2]="wed";
		sc1[3]="thrsday";
		sc1[4]="friday";
		sc1[5]="Sat";
		sc1[6]="sunday";
		
		
		
	    System.out.println("enter yourday index number");

	
	    int index1 = day.nextInt();
	    System.out.println("the day is"+index1);
	
	
	
	

	
	
	}
	

		
	}

		

		
		


