package EXERCISE_MYSELF;

public class a21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] x = {1,3,2,3};
		
		boolean flag = false;
		
		
		for(int i=0;i<x.length-1;i++) {
			
			if(x[i]==2 && x[i+1]==2) {
				flag = true;
				break;
			}
		}
		
		
		
	
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
