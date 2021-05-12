package array;

public class returnarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] values;
		values=getarray();
		
		for(double num: values) {
			System.out.println(num+"");
		}
	}

	public static double[] getarray() {
		
		
		double[] array = {1,2,3,4,5,6,7,7,8,9};
		
		return array;
		
	}
}
