package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//option1
		int[]numbers;
		
		numbers = new int [5];
		//option2
		
		int[]numbers1 = new int[9];
		float[]letters=new float[100];
	    char[] letter=new char[30];
	    long[] hello=new long[99];
	    String[]names= new String[9];
	    
	    
	    int[] scores = new int[5];
	    scores[0]=10;
	    scores[1]=20;
	    scores[2]=30;
	    scores[3]=40;
	    scores[4]=50;
	    
	    System.out.println(0);
	    System.out.println(1);
	    System.out.println(2);
	    System.out.println(3);
	    System.out.println(4);
	    
	    int avaragenumber=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
	   
	    System.out.println(avaragenumber);
	    
	    
	    Scanner userin = new Scanner(System.in);
	
	    
	    String[]myarray=new String[13];
	    
	    myarray[1]="January";
	    myarray[2]="feb";
	    myarray[3]="march";
	    myarray[4]="april";
	    myarray[5]="may";
	    myarray[6]="june";
	    myarray[7]="july";
	    myarray[8]="august";
	    myarray[9]="september";
	    myarray[10]="octobar";
	    myarray[11]="november";
	    myarray[12]="dceber";
	    System.out.println("enter you month");
	  
	    int index = userin.nextInt();
	    
	    System.out.println("month name is"+ myarray[index]);
	    
	
	    Scanner puter = new Scanner(System.in);
	    String[]days=new String[8];
	
	    days[1]="monday";
	    days[2]="tuesday";
	    days[3]="wednesday";
	    days[4]="thursday";
	    days[5]="friday";
	    days[6]="sat";
	    days[7]="sun";
	    
	    System.out.println("enter your day");
	    
	    int put=userin.nextInt();
	    
	    System.out.println("day name is: "+ days[put]);
	    
	    
	    
	}


	}


