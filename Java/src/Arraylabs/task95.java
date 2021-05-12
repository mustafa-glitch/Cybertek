package Arraylabs;

public class task95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int studentscore[][] = {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		int sum=0;
		for(int i=0; i<studentscore[0].length; i++) {
			
			 sum = sum+studentscore[0][i];
		}
		
		
		System.out.println(sum/studentscore[0].length);
	
		
	}

}
