package day30Wrapper;

public class ParsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Today weather is sunny and 89 degree. It is a perfect day to practice java.";
		
		String arr[] =str1.split("and " );
		
		arr=arr[1].split("degree.");
		
		String degree =arr[0];
		double doublef = Double.parseDouble(degree);
		
		double degreeC= (doublef-32) *5/9;
		
		System.out.println(doublef+ " degree is equal to "+Math.round(degreeC));
		
		
		
		
	}

}
