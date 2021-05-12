package day28;

public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,1,3};
	
		int q = 2;
		
		System.out.println(iseverywhere(x,q));
	}

	public static boolean iseverywhere(int[] arr1, int number) {
		
		for(int i=0; i<arr1.length-2; i++) {
			
			if ((arr1[i]==number && arr1[+1]==number || arr1[i+2]==number))	{
				
				return true;
				
			}
				
		}
		
		return false;
	}
}
