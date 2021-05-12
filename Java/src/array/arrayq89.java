package array;

public class arrayq89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mylist= {10,20,30,40};
	
		String[] myarray = {"Apple","orange","peach"};
		
		
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	System.out.println(mylist);
	System.out.println(myarray);
		
		for(int i=0; i<mylist.length; i ++) {
			
			System.out.println(mylist[i]);
			
			
		}
		
		
		int[] score = {10,20,30,40,50,60,70,90,10,203,4,20,20,40};
		
		int sum = 0;
        
		
		for(int i=0; i<score.length; i ++) {
			
			System.out.println(score[i]);
			
		sum= sum+score[i];
		
		
		System.out.println("sum is"+ sum);
		System.out.println("element is" + score.length);
		System.out.println("avarage is " + sum/score.length);
		
		
	}
	
	  

	}
}
