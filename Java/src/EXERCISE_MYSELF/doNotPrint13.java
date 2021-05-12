package EXERCISE_MYSELF;

public class doNotPrint13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,2,3,4,13,3};
		
		int sum=0;
		
		for(int i=0; i<x.length; i++) {
			
			sum=sum+x[i];
			
			if(x[i] != 13) {
				sum=sum+x[i];
			}else {
				break;
	    }
  
     }
           System.out.println(sum);

  }
}