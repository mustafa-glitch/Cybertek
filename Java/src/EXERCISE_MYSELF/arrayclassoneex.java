package EXERCISE_MYSELF;

public class arrayclassoneex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		nums(1,2,3);
		
	}

	public static void nums(int...numbers) {
		
		int sum=0;
		
		for(int value: numbers) {
			
			sum=sum+value;
			
			
		}
		
		System.out.println(sum);
	}
}
