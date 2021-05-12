package day28;

public class labquestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]= {1,2,3,4,5,6,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6};
	
	   int b = sum(x);
	   
	   System.out.println(b);
	}
	
	public static int sum(int[]x) {
		
		int sum=0;
		for(int b: x) {
			
			sum=sum+b;
			
			
		}
		return sum;
	}
}
