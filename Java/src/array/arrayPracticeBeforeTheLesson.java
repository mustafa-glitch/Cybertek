package array;

import java.util.Arrays;
import java.util.Random;

public class arrayPracticeBeforeTheLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Random rn = new Random();
		
		int[] numbers = new int[10];
		
		numbers[0]=rn.nextInt(100);
		numbers[1]=rn.nextInt(100);
		numbers[2]=rn.nextInt(100);
		numbers[3]=rn.nextInt(100);
		numbers[4]=rn.nextInt(100);
		numbers[5]=rn.nextInt(100);
		numbers[6]=rn.nextInt(100);
		numbers[7]=rn.nextInt(100);
		numbers[8]=rn.nextInt(100);
		numbers[9]=rn.nextInt(100);
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i]=rn.nextInt(100);
	    }
        for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i]);
			
			System.out.println("-----------------------");
}
        
        Random ran = new Random();
        int[] prices = new int[5];
        
        prices[0]=rn.nextInt(50);
        prices[0]=rn.nextInt(50);
        prices[0]=rn.nextInt(50);
        prices[0]=rn.nextInt(50);
        prices[0]=rn.nextInt(50);
        prices[0]=rn.nextInt(50);
        
        for(int i= 0; i<prices.length;i++) {
        	
        	numbers[i]=ran.nextInt(50);
       
        }
        
        for(int i=0; i<prices.length; i ++) {
        	
        	System.out.println(numbers[i]);
        }
        
        System.out.println("----------------------");
        
        
        
		int[]  numbers1 = new int[10];
		
		
		for(int i=0;i<numbers1.length;i++) {
			
			numbers1[i] = i+1;
		}
		
		for(int i=0;i<numbers1.length;i++) {
			
			System.out.println(numbers1[i] * 19);
		}
		
		System.out.println(Arrays.toString(numbers1));
		
		System.out.println("**************");
		
		

		int[] array1 = {2,4,6,8,10};
		
		int[] array2 = array1;
		
		array1[0]=1;
		array2[1]=2;
		
		System.out.println("The contencts of array1:");
		
		
		for(int value: array1) {
			System.out.println(value);
			
		}
		
		for(int value: array2) {
			
			System.out.println(value);
		}
		
		System.out.println("--------------------------");
	}


	int[] numbers = {5,10,15,20,50,30};
	{
	for(int value : numbers) {
		
		showValue(value);
	}

	}

public static void showValue(int n) {
	
	System.out.print(n + " ");
	
}
}

